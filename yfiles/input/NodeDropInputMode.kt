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
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.view.DragDropEffects
import yfiles.view.DragSource

/**
 * An [ItemDropInputMode] specialized to the drag and drop of [INode]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [NodeDropInputMode] class for [INode]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-constructor-NodeDropInputMode()">Online Documentation</a>
 */
external open class NodeDropInputMode  () : ItemDropInputMode<INode> {
/**
 * Initializes a new instance of the [NodeDropInputMode] class for the expected data type.
 * @param [expectedType] The type that is used in [startDrag].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-constructor-NodeDropInputMode(string)">Online Documentation</a>
 */
protected constructor( expectedType: String )
/**
 * Initializes a new instance of the [NodeDropInputMode] class for the expected data type.
 * @param [expectedType] A list of types that are used in [startDrag].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-constructor-NodeDropInputMode(string[])">Online Documentation</a>
 */
protected constructor( expectedType: ReadonlyArray<String> )

/**
 * Gets or sets a value indicating whether nodes can be dropped on [collapsed][yfiles.graph.IFoldingView.collapse] folder nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23allowFolderNodeAsParent">Online Documentation</a>
 */
final var allowFolderNodeAsParent: Boolean
/**
 * Gets or sets a value indicating whether nodes can be dropped onto nodes that are no [group nodes][IGraph.isGroupNode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23allowNonGroupNodeAsParent">Online Documentation</a>
 */
final var allowNonGroupNodeAsParent: Boolean
/**
 * Gets the currently dragged [IModelItem] instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23draggedItem">Online Documentation</a>
 */
override val draggedItem: INode?
/**
 * Gets or sets the callback for testing whether a [dragged node][ItemDropInputMode.draggedItem] should be created as a [group node][IGraph.isGroupNode].
 * 
 * The default implementation returns `false` always. Can be set to a different value to implement custom group node detection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23isGroupNodePredicate">Online Documentation</a>
 */
final var isGroupNodePredicate: Predicate<INode>
/**
 * Gets or sets the callback for testing whether an existing node in the graph can be used as a valid parent node in the context of grouping.
 * 
 * The default implementation returns `true` always. Can be set to a different value to implement custom group node detection. Note that the node passed to the predicate may be `null` to indicate that the node will be placed at the root of the hierarchy.
 * @see [allowNonGroupNodeAsParent]
 * @see [allowFolderNodeAsParent]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23isValidParentPredicate">Online Documentation</a>
 */
final var isValidParentPredicate: Predicate<INode>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-method-collectSnapResults">Online Documentation</a>
 */
 override   fun collectSnapResults( source: IEventDispatcher ,
 event: CollectSnapResultsEventArgs )
/**
 * Creates the node in the graph after it's been dropped.
 * @param [context] The context for which the node should be created.
 * @param [graph] The [Graph][IGraph] in which to create the item.
 * @param [node] The node that was dragged and should therefore be created.
 * @param [dropTarget] The [IModelItem] on which the node is dropped.
 * @param [layout] The bounds of the new node.
 * @return a newly created node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-method-createNode">Online Documentation</a>
 */
 open protected   fun createNode( context: IInputModeContext ,
 graph: IGraph ,
 node: INode ,
 dropTarget: IModelItem? ,
 layout: Rect ):INode?
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-method-getDropTarget">Online Documentation</a>
 */
 override   fun getDropTarget( dragLocation: Point ):IModelItem?
/**
 * Calculates the layout of the new node.
 * @param [mouseLocation] Current mouse position
 * @param [size] Size of the node
 * @return a [Rect] with the given size and the mouse location as center.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-method-getNodeLayout">Online Documentation</a>
 */
 open protected   fun getNodeLayout( mouseLocation: Point ,
 size: Size ):Rect
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-method-populatePreviewGraph">Online Documentation</a>
 */
 override   fun populatePreviewGraph( previewGraph: IGraph )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-method-updatePreview">Online Documentation</a>
 */
 override   fun updatePreview( previewGraph: IGraph ,
 dragLocation: Point )

companion object : ClassMetadata<NodeDropInputMode> {
/**
 * Starts a drag and drop operation for a [INode].
 * @param [dragSource] The source of the drag operation.
 * @param [node] The node to drag.
 * @param [dragDropEffects] The allowed drag drop effects.
 * @param [useCssCursors] Whether to adjust the classes of elements being hovered over during the drag. The default is `true`.
 * @param [dragPreview] Optional element that should be shown during dragging, e.g. outside of the [GraphComponent][yfiles.view.GraphComponent]. Note that this feature requires support for CSS pointer-events and should not be used in browsers that do not support it.
 * @see [DragSource.startDrag]
 * @see [DragDropItem][yfiles.view.DragDropItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeDropInputMode%23NodeDropInputMode-method-startDrag">Online Documentation</a>
 */
 final   fun startDrag( dragSource: Element /* HTMLElement | SVGElement */? ,
 node: INode ,
 dragDropEffects: DragDropEffects  = definedExternally,
 useCssCursors: Boolean  = definedExternally,
 dragPreview: Element /* HTMLElement | SVGElement */?  = definedExternally):DragSource
}
}

inline fun NodeDropInputMode(
    block: NodeDropInputMode.() -> Unit
): NodeDropInputMode {
    return NodeDropInputMode()
        .apply(block)
}
