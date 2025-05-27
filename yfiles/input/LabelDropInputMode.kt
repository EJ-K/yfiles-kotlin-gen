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
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Point
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelOwner
import yfiles.graph.IModelItem
import yfiles.lang.ClassMetadata
import yfiles.lang.Func3
import yfiles.view.DragDropEffects
import yfiles.view.DragEventArgs
import yfiles.view.DragSource

/**
 * An [ItemDropInputMode] specialized to the drag and drop of [ILabel]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [LabelDropInputMode] class for the given data type.
 * @param [transferType] A list of types for which this input mode is registered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-constructor-LabelDropInputMode">Online Documentation</a>
 */
open external class LabelDropInputMode (
  vararg transferType: String,
) : ItemDropInputMode<ILabel> {
  /**
   * Gets or sets a value indicating whether the [EDIT_LABEL][Command] command is automatically raised after a label has been created.
   * 
   * The default value is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23autoEditLabel">Online Documentation</a>
   */
  final var autoEditLabel: Boolean
  
  /**
   * Gets the currently dragged [IModelItem] instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23draggedItem">Online Documentation</a>
   */
  protected open override val draggedItem: ILabel?
  
  /**
   * Gets or sets the predicate for testing whether an existing label owner in the graph can be used as owner for the currently dragged label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23isValidLabelOwnerPredicate">Online Documentation</a>
   */
  final var isValidLabelOwnerPredicate: Func3<ILabelOwner, ILabel, Boolean>
  
  /**
   * Gets or sets a value indicating whether the default implementation of [getNewLabelModelParameter][LabelDropInputMode] should determine a parameter that best matches the location of the dropped label, or if it should directly use the parameter stored in the dropped item.
   * 
   * The default value is `false`, which means the parameter from the dropped label will be used directly.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23useLocationForParameter">Online Documentation</a>
   */
  final var useLocationForParameter: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-adjustEffect">Online Documentation</a>
   */
  override fun adjustEffect(
    event: DragEventArgs,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-cleanUp">Online Documentation</a>
   */
  override fun cleanUp()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-cleanUpPreview">Online Documentation</a>
   */
  override fun cleanUpPreview()
  
  /**
   * Creates the label in the graph after it's been dropped.
   * @param [context] The context for which the label should be created.
   * @param [graph] The [Graph][IGraph] in which to create the label.
   * @param [label] The label that was dragged and should therefore be created.
   * @param [dropTarget] The [ILabelOwner] on which the label is dropped.
   * @param [parameter] The [ILabelModelParameter] of the new label.
   * @return a newly created label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-createLabel">Online Documentation</a>
   */
  protected open fun createLabel(
    context: IInputModeContext,
    graph: IGraph?,
    label: ILabel,
    dropTarget: ILabelOwner?,
    parameter: ILabelModelParameter?,
  ): ILabel?
  
  /**
   * Looks for a [valid label owner][LabelDropInputMode] at the `dragLocation`.
   * @param [dragLocation] The location to return the drop target for.
   * @return A [label owner][ILabelOwner] or `null` if no valid label owner was found at the drag location.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-getDropTarget">Online Documentation</a>
   */
  override fun getDropTarget(
    dragLocation: Point,
  ): IModelItem?
  
  /**
   * Get the layout the dragged label currently has.
   * @param [dragLocation] The current drag location
   * @param [draggedLabel] The dragged label.
   * @return The layout for the dragged label
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-getLabelLayout">Online Documentation</a>
   */
  protected open fun getLabelLayout(
    dragLocation: Point,
    draggedLabel: ILabel,
  ): IOrientedRectangle
  
  /**
   * Determines the [ILabelModelParameter] the label should have if it was dropped at `dragLocation` over `owner`.
   * @param [owner] The label owner where the label would be created. May be `null`.
   * @param [draggedLabel] The label that is currently dragged.
   * @param [dragLocation] The current drag location.
   * @return A [ILabelModelParameter] for `draggedLabel`, or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-getNewLabelModelParameter">Online Documentation</a>
   */
  protected open fun getNewLabelModelParameter(
    owner: ILabelOwner?,
    draggedLabel: ILabel,
    dragLocation: Point,
  ): ILabelModelParameter?
  
  /**
   * Determines whether the specified label can be added to the given label owner.
   * @param [owner] The label owner to which the label is being added. This parameter cannot be `null`.
   * @param [draggedLabel] The label being dragged and potentially added to the owner.
   * @return `true` if the `draggedLabel` can be added to the specified `owner`; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-isValidLabelOwner">Online Documentation</a>
   */
  protected open fun isValidLabelOwner(
    owner: ILabelOwner,
    draggedLabel: ILabel?,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-onDragEntered">Online Documentation</a>
   */
  override fun onDragEntered(
    event: InputModeEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-onItemCreated">Online Documentation</a>
   */
  override fun onItemCreated(
    event: InputModeItemEventArgs<ILabel>,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-populatePreviewGraph">Online Documentation</a>
   */
  override fun populatePreviewGraph(
    previewGraph: IGraph,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-updatePreview">Online Documentation</a>
   */
  override fun updatePreview(
    previewGraph: IGraph,
    dragLocation: Point,
  )
  
  companion object : ClassMetadata<LabelDropInputMode> {
    /**
     * The transfer type to which the [LabelDropInputMode] and its [startDrag][LabelDropInputMode] method is configured by default.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23DEFAULT_TRANSFER_TYPE">Online Documentation</a>
     */
     val DEFAULT_TRANSFER_TYPE: String
    
    /**
     * Starts a drag and drop operation for a [ILabel].
     * @param [dragSource] The source of the drag operation.
     * @param [label] The label to drag.
     * @param [dragDropEffects] The allowed drag drop effects.
     * @param [useCssCursors] Whether to adjust the classes of elements being hovered over during the drag. The default is `true`.
     * @param [dragPreview] Optional element that should be shown during dragging, e.g. outside of the [GraphComponent][yfiles.view.GraphComponent]. Note that this feature requires support for CSS pointer-events and should not be used in browsers that do not support it.
     * @return The new [DragSource] instance.
     * @see [DragSource.startDrag]
     * @see [DragDropItem][yfiles.view.DragDropItem]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-startDrag">Online Documentation</a>
     */
    fun startDrag(
      dragSource: Element /* HTMLElement | SVGElement */?,
      label: ILabel,
      dragDropEffects: DragDropEffects  = definedExternally,
      useCssCursors: Boolean  = definedExternally,
      dragPreview: Element /* HTMLElement | SVGElement */?  = definedExternally,
    ): DragSource
  }
}
