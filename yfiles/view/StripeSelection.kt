// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IEnumerator
import yfiles.graph.IColumn
import yfiles.graph.IRow
import yfiles.graph.IStripe
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1

/**
 * Default implementation of the [IStripeSelection] interface.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection">Online Documentation</a>
 * 
 * @constructor Default constructor that creates empty selection models.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-constructor-StripeSelection">Online Documentation</a>
 */
external open class StripeSelection  () : IStripeSelection {

/**
 * Gets or sets whether to allow the selection to span multiple table instances
 * 
 * The default is `true`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23allowCrossTableSelection">Online Documentation</a>
 */
final override var allowCrossTableSelection: Boolean
/**
 * Gets or sets whether to allow mixed row/column selections
 * 
 * The default is `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23allowMixedSelection">Online Documentation</a>
 */
final override var allowMixedSelection: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23selectedColumns">Online Documentation</a>
 */
final override val selectedColumns: ISelectionModel<IColumn>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23selectedRows">Online Documentation</a>
 */
final override val selectedRows: ISelectionModel<IRow>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-clear">Online Documentation</a>
 */
 final override   fun clear()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-getEnumerator">Online Documentation</a>
 */
 final override   fun getEnumerator():IEnumerator<IStripe>
/**
 * Return whether `stripe` is currently selected
 * @param [item] The stripe to test
 * @return `true` iff `stripe` is currently selected
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-isSelected">Online Documentation</a>
 */
 final override   fun isSelected( item: IStripe ):Boolean
/**
 * Raises the [ItemSelectionChanged] event
 * @param [event] The parameters for the event
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-onItemSelectionChanged">Online Documentation</a>
 */
 open protected   fun onItemSelectionChanged( event: ItemSelectionChangedEventArgs<IStripe> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-setSelected">Online Documentation</a>
 */
 final override   fun setSelected( item: IStripe ,
 selected: Boolean )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23ItemSelectionChanged">Online Documentation</a>
 */
override fun addItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<IStripe>>)
override fun removeItemSelectionChangedListener(listener: EventHandler1<ItemSelectionChangedEventArgs<IStripe>>)

companion object : ClassMetadata<StripeSelection> {
}
}

inline fun StripeSelection(
    block: StripeSelection.() -> Unit
): StripeSelection {
    return StripeSelection()
        .apply(block)
}
