package com.akikhtenko.split;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.e4.ui.workbench.modeling.EPartService;

public class ExchangeProcessor extends AbstractSplitHandler {

	@Override
	protected void handleAction(ExecutionEvent event, EPartService partService) {
		new ExchangeAction(partService).exchange();
	}
}
