// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import js.array.ReadonlyArray
import yfiles.collections.IEnumerator
import yfiles.collections.IObservableCollection
import yfiles.collections.ItemEventArgs
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
external class StripeSelection () : IStripeSelection {
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
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23isReadOnly">Online Documentation</a>
   */
  final override val isReadOnly: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23selectedColumns">Online Documentation</a>
   */
  final override val selectedColumns: IObservableCollection<IColumn>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23selectedRows">Online Documentation</a>
   */
  final override val selectedRows: IObservableCollection<IRow>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-add">Online Documentation</a>
   */
  override fun add(
    item: IStripe,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-clear">Online Documentation</a>
   */
  override fun clear()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-copyTo">Online Documentation</a>
   */
  override fun copyTo(
    array: Array<in IStripe>,
    arrayIndex: Int,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-getEnumerator">Online Documentation</a>
   */
  override fun getEnumerator(): IEnumerator<IStripe>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23StripeSelection-method-remove">Online Documentation</a>
   */
  override fun remove(
    item: IStripe,
  ): Boolean
  
  companion object : ClassMetadata<StripeSelection> {
  }
}

inline fun StripeSelection(
    block: StripeSelection.() -> Unit
): StripeSelection {
    return StripeSelection()
        .apply(block)
}

/**
 * `item-added`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23item-added">Online Documentation</a>
 */
inline fun  StripeSelection.addItemAddedHandler(
  crossinline handler: (item:IStripe) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IStripe>> = { event, _ -> handler(event.item) }
  addEventListener("item-added", listener)
  return { removeEventListener("item-added", listener) }
}

/**
 * `item-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeSelection%23item-removed">Online Documentation</a>
 */
inline fun  StripeSelection.addItemRemovedHandler(
  crossinline handler: (item:IStripe) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IStripe>> = { event, _ -> handler(event.item) }
  addEventListener("item-removed", listener)
  return { removeEventListener("item-removed", listener) }
}
