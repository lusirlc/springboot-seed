package cn.ulegal.seed.handler;

import cn.ulegal.seed.base.BaseResult;
import cn.ulegal.seed.base.BaseResultGenerator;
import cn.ulegal.seed.enums.BaseResultEnum;
import cn.ulegal.seed.exception.BusinessException;
import com.google.common.collect.ImmutableMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created By Chuan Lu On 2019/2/28 12:52
 */
@Slf4j
@RestControllerAdvice
public class MyExceptionHandler {
	//使用EXCEPTIONS存放异常类型和错误代码的映射，ImmutableMap的特点的一旦创建不可改变，并且线程安全
	private static ImmutableMap<Class<? extends Throwable>, BaseResultEnum> EXCEPTIONS;
	
	//使用builder来构建一个异常类型和错误代码的异常
	protected static ImmutableMap.Builder<Class<? extends Throwable>, BaseResultEnum> builder = ImmutableMap.builder();
	
	//捕获Exception异常
	@ExceptionHandler(Exception.class)
	public BaseResult exception(Exception e) {
		log.error("catch exception:{}\r\nexception:{} ", e.getMessage(), e);
		if (EXCEPTIONS == null)
			EXCEPTIONS = builder.build();
		final BaseResultEnum BaseResultEnum = EXCEPTIONS.get(e.getClass());
		final BaseResult BaseResult;
		if (BaseResultEnum != null) {
			BaseResult = new BaseResult();
			BaseResult.setCode(BaseResultEnum.getCode());
			BaseResult.setMessage(BaseResultEnum.getMessage());
		} else {
			BaseResult = BaseResultGenerator.error(BaseResultEnum.SERVER_ERROR);
		}
		return BaseResult;
	}
	
	@ExceptionHandler(BusinessException.class)//可以直接写@ExceptionHandler,不指明异常类，会自动映射
	public BaseResult CreditLoserExceptionHnadler(BusinessException exception) { //还可以声明接收其他任意参数
		return BaseResultGenerator.error( BaseResultEnum.FAIL);
	}
}