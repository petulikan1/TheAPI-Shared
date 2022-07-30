package me.devtec.shared.commands.structures;

import java.util.List;

import me.devtec.shared.API;
import me.devtec.shared.commands.holder.CommandExecutor;
import me.devtec.shared.commands.selectors.Selector;

public class SelectorCommandStructure<S> extends CommandStructure<S> {
	private Selector selector;

	protected SelectorCommandStructure(CommandStructure<S> parent, Selector selector, CommandExecutor<S> ex) {
		super(parent, ex);
		this.selector = selector;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> tabList(S sender, CommandStructure<S> structure, String[] arguments) {
		return API.selectorUtils.build(sender, this.selector);
	}

	/**
	 * @apiNote Returns selector of this {@link SelectorCommandStructure}
	 */
	public Selector getSelector() {
		return this.selector;
	}
}
