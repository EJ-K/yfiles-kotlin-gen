// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import web.dom.Element
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.IGraph
import yfiles.graph.IStripe
import yfiles.graph.ITable
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.view.DragDropEffects
import yfiles.view.DragEventArgs
import yfiles.view.DragSource

/**
 * An [ItemDropInputMode] specialized to the drag and drop of [IStripe]s.
 * @see [startDrag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [StripeDropInputMode] class for the given data type.
 * @param [transferType] A list of types for which this input mode is registered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-constructor-StripeDropInputMode">Online Documentation</a>
 */
open external class StripeDropInputMode (
  vararg transferType: String,
) : ItemDropInputMode<IStripe> {
  /**
   * Gets the currently dragged [IModelItem][yfiles.graph.IModelItem] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23draggedItem">Online Documentation</a>
   */
  protected open override val draggedItem: IStripe?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-adjustEffect">Online Documentation</a>
   */
  override fun adjustEffect(
    event: DragEventArgs,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-cancel">Online Documentation</a>
   */
  override fun cancel()
  
  /**
   * Create a preview version of the table that is temporarily used to show the dragged stripe.
   * @return A preview [ITable] instance representing the temporarily displayed table for the dragged stripe.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-createPreviewTable">Online Documentation</a>
   */
  protected open fun createPreviewTable(): ITable
  
  /**
   * Create a new stripe as the result of a drag and drop gesture.
   * @param [context] The context for which the stripe should be created.
   * @param [newParent] The parent for which to create the stripe.
   * @param [draggedStripe] The dragged stripe.
   * @return a newly created stripe.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-createStripe">Online Documentation</a>
   */
  protected open fun createStripe(
    context: IInputModeContext,
    newParent: IStripe,
    draggedStripe: IStripe?,
  ): IStripe?
  
  /**
   * Calculates the layout of the new table.
   * @param [location] Current pointer position
   * @param [size] Size of the table
   * @return a [Rect] with the given size and the pointer location as center.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-getPreviewTableLayout">Online Documentation</a>
   */
  protected open fun getPreviewTableLayout(
    location: Point,
    size: Size,
  ): Rect
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-onDragDropped">Online Documentation</a>
   */
  override fun onDragDropped(
    event: InputModeEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-onDragEntered">Online Documentation</a>
   */
  override fun onDragEntered(
    event: InputModeEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-onDragLeft">Online Documentation</a>
   */
  override fun onDragLeft(
    event: InputModeEventArgs,
  )
  
  /**
   * Called whenever a new stripe is created.
   * @param [event] The [InputModeItemEventArgs] of the creation event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-onStripeCreated">Online Documentation</a>
   */
  protected open fun onStripeCreated(
    event: InputModeItemEventArgs<IStripe>,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-populatePreviewGraph">Online Documentation</a>
   */
  override fun populatePreviewGraph(
    previewGraph: IGraph,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-setDragLocation">Online Documentation</a>
   */
  override fun setDragLocation(
    location: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-updatePreview">Online Documentation</a>
   */
  override fun updatePreview(
    previewGraph: IGraph,
    dragLocation: Point,
  )
  
  companion object : ClassMetadata<StripeDropInputMode> {
    /**
     * The transfer type to which the [StripeDropInputMode] and its [startDrag][StripeDropInputMode] method is configured by default.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23DEFAULT_TRANSFER_TYPE">Online Documentation</a>
     */
     val DEFAULT_TRANSFER_TYPE: String
    
    /**
     * Starts a drag and drop operation for an [IStripe].
     * @param [dragSource] The source of the drag operation.
     * @param [stripe] The stripe to drag.
     * @param [dragDropEffects] The allowed drag drop effects.
     * @param [useCssCursors] Whether to adjust the classes of elements being hovered over during the drag. The default is `true`.
     * @param [dragPreview] Optional element that should be shown during dragging, e.g. outside of the [GraphComponent][yfiles.view.GraphComponent]. Note that this feature requires support for CSS pointer-events and should not be used in browsers that do not support it.
     * @return The new [DragSource] instance.
     * @see [DragSource.startDrag]
     * @see [DragDropItem][yfiles.view.DragDropItem]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23StripeDropInputMode-method-startDrag">Online Documentation</a>
     */
    fun startDrag(
      dragSource: Element /* HTMLElement | SVGElement */?,
      stripe: IStripe,
      dragDropEffects: DragDropEffects  = definedExternally,
      useCssCursors: Boolean  = definedExternally,
      dragPreview: Element /* HTMLElement | SVGElement */?  = definedExternally,
    ): DragSource
  }
}

/**
 * `stripe-created`: Occurs when a new stripe gets created by this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/StripeDropInputMode%23stripe-created">Online Documentation</a>
 */
inline fun  StripeDropInputMode.addStripeCreatedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IStripe>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IStripe>> = { event, _ -> handler(event) }
  addEventListener("stripe-created", listener)
  return { removeEventListener("stripe-created", listener) }
}
