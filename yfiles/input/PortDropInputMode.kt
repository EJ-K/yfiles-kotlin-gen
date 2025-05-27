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
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.graph.IPort
import yfiles.graph.IPortLocationModelParameter
import yfiles.graph.IPortOwner
import yfiles.lang.ClassMetadata
import yfiles.lang.Func3
import yfiles.lang.IEventDispatcher
import yfiles.view.DragDropEffects
import yfiles.view.DragEventArgs
import yfiles.view.DragSource

/**
 * An [ItemDropInputMode] specialized to the drag and drop of [IPort]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [PortDropInputMode] class for the given data type.
 * @param [transferType] A list of types for which this input mode is registered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-constructor-PortDropInputMode">Online Documentation</a>
 */
open external class PortDropInputMode (
  vararg transferType: String,
) : ItemDropInputMode<IPort> {
  /**
   * Gets the currently dragged [IModelItem] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23draggedItem">Online Documentation</a>
   */
  protected open override val draggedItem: IPort?
  
  /**
   * Gets or sets the callback for testing whether an existing port owner in the graph can be used as owner for the currently dragged port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23isValidPortOwnerPredicate">Online Documentation</a>
   */
  final var isValidPortOwnerPredicate: Func3<IPortOwner, IPort, Boolean>
  
  /**
   * Gets or sets a value indicating whether the default implementation of [getNewPortLocationModelParameter][PortDropInputMode] should determine a parameter that best matches the location of the dropped port, or if it should directly use the parameter stored in the dropped item.
   * 
   * The default value is `false`, which means the parameter from the dropped port will be used directly.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23useLocationForParameter">Online Documentation</a>
   */
  final var useLocationForParameter: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-adjustEffect">Online Documentation</a>
   */
  override fun adjustEffect(
    event: DragEventArgs,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-cleanUpPreview">Online Documentation</a>
   */
  override fun cleanUpPreview()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-collectSnapResults">Online Documentation</a>
   */
  override fun collectSnapResults(
    event: CollectSnapResultsEventArgs,
    source: IEventDispatcher,
  )
  
  /**
   * Creates the port in the graph after it has been dropped.
   * @param [context] The context for which the port should be created.
   * @param [graph] The [graph][IGraph] in which to create the port.
   * @param [draggedPort] The port that was dragged and should therefore be created.
   * @param [dropTarget] The [IPortOwner] on which the port is dropped.
   * @param [parameter] The [IPortLocationModelParameter] of the new port.
   * @return a newly created label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-createPort">Online Documentation</a>
   */
  protected open fun createPort(
    context: IInputModeContext,
    graph: IGraph?,
    draggedPort: IPort,
    dropTarget: IPortOwner?,
    parameter: IPortLocationModelParameter?,
  ): IPort?
  
  /**
   * Looks for a [valid port owner][PortDropInputMode] at the `dragLocation`.
   * @param [dragLocation] The location to check for a valid port owner.
   * @return A [port owner][IPortOwner] or `null` if no valid port owner was found at the drop location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-getDropTarget">Online Documentation</a>
   */
  override fun getDropTarget(
    dragLocation: Point,
  ): IModelItem?
  
  /**
   * Determines the [IPortLocationModelParameter] the port should have if it was dropped at `dragLocation` over `owner`.
   * @param [owner] The port owner where the port would be created. May be `null`.
   * @param [draggedPort] The port that is currently dragged.
   * @param [dragLocation] The current drag location.
   * @return A [IPortLocationModelParameter] for `draggedPort`, or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-getNewPortLocationModelParameter">Online Documentation</a>
   */
  protected open fun getNewPortLocationModelParameter(
    owner: IPortOwner?,
    draggedPort: IPort,
    dragLocation: Point,
  ): IPortLocationModelParameter?
  
  /**
   * Default backing method for [isValidPortOwnerPredicate][PortDropInputMode]
   * @param [owner] The port owner where the port would be created. May be `null`.
   * @param [draggedPort] The port that is currently dragged.
   * @return `true` iff `owner` can be used to drop a port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-isValidPortOwner">Online Documentation</a>
   */
  protected open fun isValidPortOwner(
    owner: IPortOwner?,
    draggedPort: IPort?,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-populatePreviewGraph">Online Documentation</a>
   */
  override fun populatePreviewGraph(
    previewGraph: IGraph,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-updatePreview">Online Documentation</a>
   */
  override fun updatePreview(
    previewGraph: IGraph,
    dragLocation: Point,
  )
  
  companion object : ClassMetadata<PortDropInputMode> {
    /**
     * The transfer type to which the [PortDropInputMode] and its [startDrag][PortDropInputMode] method is configured by default.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23DEFAULT_TRANSFER_TYPE">Online Documentation</a>
     */
     val DEFAULT_TRANSFER_TYPE: String
    
    /**
     * Starts a drag and drop operation for a [IPort].
     * @param [dragSource] The source of the drag operation.
     * @param [port] The port to drag.
     * @param [dragDropEffects] The allowed drag drop effects.
     * @param [useCssCursors] Whether to adjust the classes of elements being hovered over during the drag. The default is `true`.
     * @param [dragPreview] Optional element that should be shown during dragging, e.g. outside of the [GraphComponent][yfiles.view.GraphComponent]. Note that this feature requires support for CSS pointer-events and should not be used in browsers that do not support it.
     * @return The new [DragSource] instance.
     * @see [DragSource.startDrag]
     * @see [DragDropItem][yfiles.view.DragDropItem]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortDropInputMode%23PortDropInputMode-method-startDrag">Online Documentation</a>
     */
    fun startDrag(
      dragSource: Element /* HTMLElement | SVGElement */,
      port: IPort,
      dragDropEffects: DragDropEffects  = definedExternally,
      useCssCursors: Boolean  = definedExternally,
      dragPreview: Element /* HTMLElement | SVGElement */?  = definedExternally,
    ): DragSource
  }
}
