package com.akikhtenko.split;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;


public class ExchangeProcessor extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow wnd = HandlerUtil.getActiveWorkbenchWindow(event);
		EPartService partService = (EPartService) wnd.getService(EPartService.class);
		
		new ExchangeAction(partService).exchange();
		
		return null;
	}
}
