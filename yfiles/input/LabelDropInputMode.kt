// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.array.ReadonlyArray
import web.dom.Element
import yfiles.collections.ItemEventArgs
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
 * @constructor Constructs a new instance of class [LabelDropInputMode] for the type [ILabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-constructor-LabelDropInputMode()">Online Documentation</a>
 */
external open class LabelDropInputMode  () : ItemDropInputMode<ILabel> {
/**
 * Constructs a new instance of class [DropInputMode] for the expected data type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-constructor-LabelDropInputMode(string)">Online Documentation</a>
 */
protected constructor( expectedType: String )
/**
 * Constructs a new instance of class [DropInputMode] for the expected data type.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-constructor-LabelDropInputMode(string[])">Online Documentation</a>
 */
protected constructor( expectedType: ReadonlyArray<String> )

/**
 * Gets or sets a value indicating whether the [ICommand.EDIT_LABEL] command is automatically raised after a label has been created.
 * 
 * The default value is `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23autoEditLabel">Online Documentation</a>
 */
final var autoEditLabel: Boolean
/**
 * Gets the currently dragged [IModelItem] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23draggedItem">Online Documentation</a>
 */
override val draggedItem: ILabel?
/**
 * Gets or sets the predicate for testing whether an existing label owner in the graph can be used as owner for the currently dragged label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23isValidLabelOwnerPredicate">Online Documentation</a>
 */
final var isValidLabelOwnerPredicate: Func3<ILabelOwner, ILabel, Boolean>
/**
 * Gets or sets a value indicating whether the default implementation of [getNewLabelModelParameter] should directly use the parameter stored in the dragged item or whether the current drop location should be also taken into account to find a parameter that best matches the drag location.
 * 
 * The default value is `false`, which means to use the parameter directly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23useBestMatchingParameter">Online Documentation</a>
 */
final var useBestMatchingParameter: Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-adjustEffect">Online Documentation</a>
 */
 override   fun adjustEffect( event: DragEventArgs ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-cleanUp">Online Documentation</a>
 */
 override   fun cleanUp()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-cleanUpPreview">Online Documentation</a>
 */
 override   fun cleanUpPreview()
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
 open protected   fun createLabel( context: IInputModeContext ,
 graph: IGraph? ,
 label: ILabel ,
 dropTarget: ILabelOwner? ,
 parameter: ILabelModelParameter? ):ILabel?
/**
 * Looks for a [valid label owner][isValidLabelOwnerPredicate] at the `dragLocation`.
 * @return A [label owner][ILabelOwner] or `null` if no valid label owner was found at the drag location.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-getDropTarget">Online Documentation</a>
 */
 override   fun getDropTarget( dragLocation: Point ):IModelItem?
/**
 * Get the layout the dragged label currently has.
 * @param [dragLocation] The current drag location
 * @param [draggedLabel] The dragged label.
 * @return The layout for the dragged label
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-getLabelLayout">Online Documentation</a>
 */
 open protected   fun getLabelLayout( dragLocation: Point ,
 draggedLabel: ILabel ):IOrientedRectangle
/**
 * Determine the [ILabelModelParameter] the label should have if it were dropped at `draggedLocation` over `owner`.
 * @param [owner] The label owner where the label would be created. May be `null`.
 * @param [draggedLabel] The label that is currently dragged.
 * @param [draggedLocation] The current drag location.
 * @return A [ILabelModelParameter] for `draggedLabel`, or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-getNewLabelModelParameter">Online Documentation</a>
 */
 open protected   fun getNewLabelModelParameter( owner: ILabelOwner? ,
 draggedLabel: ILabel ,
 draggedLocation: Point ):ILabelModelParameter?
/**
 * Default backing method for [isValidLabelOwnerPredicate]
 * @param [owner] The label owner where the label would be created. May be `null`.
 * @param [draggedLabel] The label that is currently dragged.
 * @return `true` iff `owner` can be used to drop a label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-isValidLabelOwner">Online Documentation</a>
 */
 open protected   fun isValidLabelOwner( owner: ILabelOwner? ,
 draggedLabel: ILabel? ):Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-onDragEntered">Online Documentation</a>
 */
 override   fun onDragEntered( event: InputModeEventArgs )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-onItemCreated">Online Documentation</a>
 */
 override   fun onItemCreated( event: ItemEventArgs<ILabel> )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-populatePreviewGraph">Online Documentation</a>
 */
 override   fun populatePreviewGraph( previewGraph: IGraph )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-updatePreview">Online Documentation</a>
 */
 override   fun updatePreview( previewGraph: IGraph ,
 dragLocation: Point )

companion object : ClassMetadata<LabelDropInputMode> {
/**
 * Starts a drag and drop operation for a [ILabel].
 * @param [dragSource] The source of the drag operation.
 * @param [label] The label to drag.
 * @param [dragDropEffects] The allowed drag drop effects.
 * @param [useCssCursors] Whether to adjust the classes of elements being hovered over during the drag. The default is `true`.
 * @param [dragPreview] Optional element that should be shown during dragging, e.g. outside of the [GraphComponent][yfiles.view.GraphComponent]. Note that this feature requires support for CSS pointer-events and should not be used in browsers that do not support it.
 * @see [DragSource.startDrag]
 * @see [DragDropItem][yfiles.view.DragDropItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelDropInputMode%23LabelDropInputMode-method-startDrag">Online Documentation</a>
 */
 final   fun startDrag( dragSource: Element /* HTMLElement | SVGElement */? ,
 label: ILabel ,
 dragDropEffects: DragDropEffects  = definedExternally,
 useCssCursors: Boolean  = definedExternally,
 dragPreview: Element /* HTMLElement | SVGElement */?  = definedExternally):DragSource
}
}

inline fun LabelDropInputMode(
    block: LabelDropInputMode.() -> Unit
): LabelDropInputMode {
    return LabelDropInputMode()
        .apply(block)
}
