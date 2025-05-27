// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher

/**
 * A [DropInputMode] providing a preview of the dragged item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [ItemDropInputMode] class for the given data type.
 * @param [transferType] A list of types that are used in [getData][yfiles.view.DragDropItem].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-constructor-ItemDropInputMode">Online Documentation</a>
 */
abstract external class ItemDropInputMode<T : IModelItem> protected constructor(
  transferType: String,
) : DropInputMode {
  /**
   * Gets or sets the event recognizer that determines whether to disable snapping temporarily.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23disableSnappingRecognizer">Online Documentation</a>
   */
  final var disableSnappingRecognizer: EventRecognizer
  
  /**
   * Gets the currently dragged item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23draggedItem">Online Documentation</a>
   */
  protected open val draggedItem: T?
  
  /**
   * Gets the drop target at [snappedPointerPosition][ItemDropInputMode]
   * @see [highlightDropTarget]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23dropTarget">Online Documentation</a>
   */
  final var dropTarget: IModelItem?
  
  /**
   * Gets or sets whether the drop target is highlighted.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23highlightDropTarget">Online Documentation</a>
   */
  final var highlightDropTarget: Boolean
  
  /**
   * Gets or sets the callback for item creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23itemCreator">Online Documentation</a>
   */
  final var itemCreator: DropCreationCallback<T>?
  
  /**
   * Gets the graph displayed as item preview.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23previewGraph">Online Documentation</a>
   */
  protected final val previewGraph: IGraph?
  
  /**
   * Gets or sets whether a preview of the dragged element is displayed during the drag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23showPreview">Online Documentation</a>
   */
  final var showPreview: Boolean
  
  /**
   * Gets or sets the [GraphSnapContext] which is used to snap the dragged element during the drag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23snapContext">Online Documentation</a>
   */
  final var snapContext: GraphSnapContext?
  
  /**
   * Gets the current snapped pointer position during drag operations.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23snappedPointerPosition">Online Documentation</a>
   */
  final val snappedPointerPosition: Point
  
  /**
   * Gets or sets whether dragged items are snapped.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23snappingEnabled">Online Documentation</a>
   */
  final var snappingEnabled: Boolean
  
  /**
   * Cleanup method that calls [cleanUpSnapContext][ItemDropInputMode], [cleanUpPreview][ItemDropInputMode] and [cleanUpDropTarget][ItemDropInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-cleanUp">Online Documentation</a>
   */
  protected open fun cleanUp()
  
  /**
   * Cleans up the drop target and its highlighting.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-cleanUpDropTarget">Online Documentation</a>
   */
  protected open fun cleanUpDropTarget()
  
  /**
   * Cleans up the item preview.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-cleanUpPreview">Online Documentation</a>
   */
  protected open fun cleanUpPreview()
  
  /**
   * Cleans up the snap context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-cleanUpSnapContext">Online Documentation</a>
   */
  protected open fun cleanUpSnapContext()
  
  /**
   * Callback registered on the [SnapContext] that collects [SnapResult]s for the dragged element.
   * 
   * The default implementation doesn't collect any snap results.
   * @param [event] The arguments describing the movement [SnapResult]s shall be collected for.
   * @param [source] The [SnapContext] this callback is registered at.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-collectSnapResults">Online Documentation</a>
   */
  protected open fun collectSnapResults(
    event: CollectSnapResultsEventArgs,
    source: IEventDispatcher,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-createInputModeContext">Online Documentation</a>
   */
  override fun createInputModeContext(): IInputModeContext
  
  /**
   * Returns the drop target at the specified location.
   * @param [dragLocation] The location to return the drop target for.
   * @return The drop target at the specified location or `null` if no drop target can be found.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-getDropTarget">Online Documentation</a>
   */
  protected open fun getDropTarget(
    dragLocation: Point,
  ): IModelItem?
  
  /**
   * Initializes the drop target.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-initializeDropTarget">Online Documentation</a>
   */
  protected open fun initializeDropTarget()
  
  /**
   * Initializes the item preview.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-initializePreview">Online Documentation</a>
   */
  protected open fun initializePreview()
  
  /**
   * Initializes the snapping context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-initializeSnapContext">Online Documentation</a>
   */
  protected open fun initializeSnapContext()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
   */
  override fun onConcurrencyControllerDeactivated()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-onDragDropped">Online Documentation</a>
   */
  override fun onDragDropped(
    event: InputModeEventArgs,
  )
  
  /**
   * Called once a drag has entered the canvas.
   * @param [event] The event argument that contains context information.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-onDragEntered">Online Documentation</a>
   */
  override fun onDragEntered(
    event: InputModeEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-onDragLeft">Online Documentation</a>
   */
  override fun onDragLeft(
    event: InputModeEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-onDraggedOver">Online Documentation</a>
   */
  override fun onDraggedOver(
    event: InputModeEventArgs,
  )
  
  /**
   * Called whenever a new item is created.
   * @param [event] The [InputModeItemEventArgs] containing the new item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-onItemCreated">Online Documentation</a>
   */
  protected open fun onItemCreated(
    event: InputModeItemEventArgs<T>,
  )
  
  /**
   * Subclasses shall fill the specified graph that is used to preview the dragged item.
   * @param [previewGraph] The preview graph to fill.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-populatePreviewGraph">Online Documentation</a>
   */
  protected open fun populatePreviewGraph(
    previewGraph: IGraph,
  )
  
  /**
   * Sets the [drag location][DropInputMode] and calls [updatePreview][ItemDropInputMode] to update the layout of item preview based on the pointer coordinates and the results of the [snapContext][ItemDropInputMode].
   * @param [location] The current location of the pointer in world coordinates.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-setDragLocation">Online Documentation</a>
   */
  override fun setDragLocation(
    location: Point,
  )
  
  /**
   * Calls [getDropTarget][ItemDropInputMode] for [snappedPointerPosition][ItemDropInputMode] and sets the returned item as [dropTarget][ItemDropInputMode].
   * @param [dragLocation] The location to update the drop target for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-updateDropTarget">Online Documentation</a>
   */
  protected open fun updateDropTarget(
    dragLocation: Point,
  )
  
  /**
   * Subclasses shall update the [previewGraph][ItemDropInputMode] so the dragged item is displayed at the specified `dragLocation`.
   * @param [previewGraph] The preview graph to update.
   * @param [dragLocation] The current drag location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23ItemDropInputMode-method-updatePreview">Online Documentation</a>
   */
  protected open fun updatePreview(
    previewGraph: IGraph,
    dragLocation: Point,
  )
  
  companion object : ClassMetadata<ItemDropInputMode<*>> {
  }
}

/**
 * `item-created`: Occurs when a new item gets created by this input mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ItemDropInputMode%23item-created">Online Documentation</a>
 */
inline fun <T : IModelItem> ItemDropInputMode<T>.addItemCreatedHandler(
  crossinline handler: (event:InputModeItemEventArgs<T>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<T>> = { event, _ -> handler(event) }
  addEventListener("item-created", listener)
  return { removeEventListener("item-created", listener) }
}
