package com.asiainfo.pmcs.service;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.asiainfo.mybatis.po.PmScreenIndexmgrJobPo;

/**
 * 功能描述：定时任务运行工厂类(非阻塞)
 * @author yfy
 * @date 2017年5月11日
 */
public class QuartzJobFactory implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		PmScreenIndexmgrJobPo scheduleJob = (PmScreenIndexmgrJobPo) context.getMergedJobDataMap().get("scheduleJob");
		TaskUtils.invokMethod(scheduleJob);
	}
}