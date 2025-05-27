// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import js.promise.Promise
import js.promise.PromiseResult
import yfiles.collections.IEnumerable
import yfiles.collections.IObservableCollection
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.graph.EdgeEventArgs
import yfiles.graph.GraphItemTypes
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.ILabelOwner
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.graph.NodeEventArgs
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.view.GraphComponent
import yfiles.view.IGraphSelection

/**
 * A complex [IInputMode] that can be used in a [GraphComponent] to edit an [IGraph][yfiles.graph.IGraph] instance.
 * @see [createEdgeInputMode]
 * @see [createBendInputMode]
 * @see [nodeDropInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance that is not bound to an existing graph or selection, initially.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-constructor-GraphEditorInputMode">Online Documentation</a>
 */
open external class GraphEditorInputMode () : GraphInputMode {
  /**
   * Gets or sets a predicate that is queried to determine whether a label can be added to the given [IModelItem].
   * 
   * The default value returns the result of the [labelEditableItems][GraphEditorInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23addLabelPredicate">Online Documentation</a>
   */
  final var addLabelPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets a property that determines whether and how this instance should automatically adjust the [contentBounds][yfiles.view.CanvasComponent] if the graph changes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23adjustContentBoundsPolicy">Online Documentation</a>
   */
  final var adjustContentBoundsPolicy: AdjustContentBoundsPolicy
  
  /**
   * Gets or sets a value determining whether the [ADD_LABEL][Command] command should be handled.
   * @see [Command.ADD_LABEL]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowAddLabel">Online Documentation</a>
   */
  final var allowAddLabel: Boolean
  
  /**
   * Gets or sets a value determining whether the [ADJUST_GROUP_NODE_SIZE][Command] command should be handled.
   * @see [allowGroupingOperations]
   * @see [adjustGroupNodeSizes]
   * @see [adjustGroupNodeSize]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowAdjustGroupNodeSize">Online Documentation</a>
   */
  final var allowAdjustGroupNodeSize: Boolean
  
  /**
   * Gets or sets a value determining whether the [DESELECT_ALL][Command] command should be handled.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowClearSelection">Online Documentation</a>
   */
  final var allowClearSelection: Boolean
  
  /**
   * Gets or sets a value determining whether [bend creation][GraphEditorInputMode] should be [enabled][CreateBendInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowCreateBend">Online Documentation</a>
   */
  final var allowCreateBend: Boolean
  
  /**
   * Gets or sets a value determining whether [edge creation][GraphEditorInputMode] should be [enabled][CreateEdgeInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowCreateEdge">Online Documentation</a>
   */
  final var allowCreateEdge: Boolean
  
  /**
   * Gets or sets a value determining whether [node creation][GraphEditorInputMode] by clicking on an empty canvas location is enabled.
   * @see [nodeCreator]
   * @see [createNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowCreateNode">Online Documentation</a>
   */
  final var allowCreateNode: Boolean
  
  /**
   * Gets or sets a value determining whether the [DUPLICATE][Command] command should be handled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowDuplicate">Online Documentation</a>
   */
  final var allowDuplicate: Boolean
  
  /**
   * Gets or sets a value determining whether the [EDIT_LABEL][Command] command should be handled.
   * @see [startLabelEditing]
   * @see [Command.EDIT_LABEL]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowEditLabel">Online Documentation</a>
   */
  final var allowEditLabel: Boolean
  
  /**
   * Gets or sets a value determining whether double-clicking should start label editing.
   * @see [allowEditLabel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowEditLabelOnDoubleClick">Online Documentation</a>
   */
  final var allowEditLabelOnDoubleClick: Boolean
  
  /**
   * Gets or sets a value determining whether starting to type should start label editing.
   * @see [KeyboardInputMode.text-input]
   * @see [allowEditLabel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowEditLabelOnTyping">Online Documentation</a>
   */
  final var allowEditLabelOnTyping: Boolean
  
  /**
   * Gets or sets a value determining whether the [GROUP_SELECTION][Command] command should be handled.
   * @see [allowGroupingOperations]
   * @see [groupSelection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowGroupSelection">Online Documentation</a>
   */
  final var allowGroupSelection: Boolean
  
  /**
   * Gets or sets a value indicating whether grouping operations like [grouping selected nodes][GraphEditorInputMode] or [moving nodes into group nodes][GraphEditorInputMode] should be enabled.
   * @see [allowGroupSelection]
   * @see [allowUngroupSelection]
   * @see [allowAdjustGroupNodeSize]
   * @see [allowReparentNodes]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowGroupingOperations">Online Documentation</a>
   */
  final var allowGroupingOperations: Boolean
  
  /**
   * Gets or sets a value determining whether the [PASTE][Command] command should be handled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowPaste">Online Documentation</a>
   */
  final var allowPaste: Boolean
  
  /**
   * Gets or sets a value indicating whether moving nodes out of group nodes or into other group nodes is allowed.
   * @see [reparentNodeHandler]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowReparentNodes">Online Documentation</a>
   */
  final var allowReparentNodes: Boolean
  
  /**
   * Gets or sets a value indicating whether moving nodes into [non-group nodes][yfiles.graph.IGraph] is allowed to convert them into group nodes.
   * @see [allowGroupingOperations]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowReparentToNonGroupNodes">Online Documentation</a>
   */
  final var allowReparentToNonGroupNodes: Boolean
  
  /**
   * Gets or sets a value indicating whether the [REVERSE_EDGE][Command] command should be handled.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowReverseEdge">Online Documentation</a>
   */
  final var allowReverseEdge: Boolean
  
  /**
   * Gets or sets a value indicating whether undo operations, that is, [UNDO][Command] and [REDO][Command] should be enabled.
   * @see [undo]
   * @see [redo]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowUndoOperations">Online Documentation</a>
   */
  final var allowUndoOperations: Boolean
  
  /**
   * Gets or sets a value determining whether the [UNGROUP_SELECTION][Command] command should be handled.
   * @see [allowGroupingOperations]
   * @see [ungroupSelection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowUngroupSelection">Online Documentation</a>
   */
  final var allowUngroupSelection: Boolean
  
  /**
   * Gets or sets a property that determines whether clicking on a node should automatically select all bends of self-loops adjacent to that node.
   * 
   * The default value is `true`.
   * @see [GraphInputMode.clickSelectableItems]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23autoSelectSelfLoopBends">Online Documentation</a>
   */
  final var autoSelectSelfLoopBends: Boolean
  
  /**
   * Gets or sets the margins to use for [updateContentBounds][yfiles.view.CanvasComponent] in [adjustContentBounds][GraphEditorInputMode] calls.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23contentMargins">Online Documentation</a>
   */
  final var contentMargins: Insets
  
  /**
   * Gets or sets the [CreateBendInputMode] which handles interactive bend creation on existing edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23createBendInputMode">Online Documentation</a>
   */
  final var createBendInputMode: CreateBendInputMode
  
  /**
   * Gets or sets the [CreateEdgeInputMode] which handles interactive edge creation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23createEdgeInputMode">Online Documentation</a>
   */
  final var createEdgeInputMode: CreateEdgeInputMode
  
  /**
   * Gets or sets which types of items should be selected after creation.
   * @see [selectAfterCreationPredicate]
   * @see [GraphInputMode.setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23creationSelectableItems">Online Documentation</a>
   */
  final var creationSelectableItems: GraphItemTypes
  
  /**
   * Gets or sets which types of items may be deleted using the [deleteSelection][GraphEditorInputMode] action.
   * 
   * The default is [ALL][GraphItemTypes].
   * @see [deletablePredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23deletableItems">Online Documentation</a>
   */
  final var deletableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an [IModelItem] can be deleted or not.
   * 
   * The default value returns the result of the [deletableItems][GraphEditorInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23deletablePredicate">Online Documentation</a>
   */
  final var deletablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets the [EditLabelInputMode] which handles label editing.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23editLabelInputMode">Online Documentation</a>
   */
  final var editLabelInputMode: EditLabelInputMode
  
  /**
   * Gets or sets a predicate that is queried to determine whether the given label or a label owned by the given owner should be edited in response to a [EDIT_LABEL][Command] command.
   * 
   * The default value returns the result of the [labelEditableItems][GraphEditorInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23editLabelPredicate">Online Documentation</a>
   */
  final var editLabelPredicate: Predicate<IModelItem>
  
  /**
   * Gets the [graphComponent][GraphEditorInputMode] instance this mode is working on or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23graphComponent">Online Documentation</a>
   */
  final val graphComponent: GraphComponent?
  
  /**
   * Gets or sets the [HandleInputMode] as child input mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23handleInputMode">Online Documentation</a>
   */
  final var handleInputMode: HandleInputMode
  
  /**
   * Gets or sets the [LabelDropInputMode] that is responsible for handling drag and drop operations of labels onto the [graphComponent][GraphEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23labelDropInputMode">Online Documentation</a>
   */
  final var labelDropInputMode: LabelDropInputMode
  
  /**
   * Gets or sets which types of items may have their labels [edited][GraphEditorInputMode] or [added][GraphEditorInputMode].
   * 
   * The default is [LABEL_OWNER][GraphItemTypes]|[LABEL][GraphItemTypes], which allows for editing the labels of [ILabelOwner]s, and existing [ILabel]s.
   * @see [editLabelPredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23labelEditableItems">Online Documentation</a>
   */
  final var labelEditableItems: GraphItemTypes
  
  /**
   * Gets or sets which types of items should be movable using the [moveSelectedItemsInputMode][GraphEditorInputMode].
   * 
   * The default is [ALL][GraphItemTypes]. Note that depending on the setting of [movableUnselectedItems][GraphEditorInputMode] and whether [moveUnselectedItemsInputMode][GraphEditorInputMode] is [enabled][MoveInputMode], in order to prevent the user from moving items, the [movableUnselectedItems][GraphEditorInputMode] should also be adjusted accordingly.
   * @see [movableSelectedItemsPredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23movableSelectedItems">Online Documentation</a>
   */
  final var movableSelectedItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether moving an item is allowed.
   * @see [movableUnselectedItemsPredicate]
   * @see [movableSelectedItems]
   * @see [moveSelectedItemsInputMode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23movableSelectedItemsPredicate">Online Documentation</a>
   */
  final var movableSelectedItemsPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets which types of items should be movable using the [moveUnselectedItemsInputMode][GraphEditorInputMode].
   * 
   * The default is [ALL][GraphItemTypes].
   * @see [movableUnselectedItemsPredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23movableUnselectedItems">Online Documentation</a>
   */
  final var movableUnselectedItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether moving an item is allowed when it is not selected.
   * @see [movableUnselectedItems]
   * @see [moveUnselectedItemsInputMode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23movableUnselectedItemsPredicate">Online Documentation</a>
   */
  final var movableUnselectedItemsPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets the [MoveInputMode] as child mode.
   * @see [movableSelectedItemsPredicate]
   * @see [movableSelectedItems]
   * @see [moveUnselectedItemsInputMode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23moveSelectedItemsInputMode">Online Documentation</a>
   */
  final var moveSelectedItemsInputMode: MoveInputMode
  
  /**
   * Gets or sets the [MoveInputMode] which handles unselected graph items.
   * @see [movableUnselectedItemsPredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23moveUnselectedItemsInputMode">Online Documentation</a>
   */
  final var moveUnselectedItemsInputMode: MoveInputMode
  
  /**
   * Gets or sets the callback that is responsible for creating a new node, for instance, in response to a mouse or stylus click or touch tap.
   * @see [createNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23nodeCreator">Online Documentation</a>
   */
  final var nodeCreator: NodeCreationCallback?
  
  /**
   * Gets or sets the [NodeDropInputMode] that is responsible for handling drag and drop operations of nodes onto the [graphComponent][GraphEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23nodeDropInputMode">Online Documentation</a>
   */
  final var nodeDropInputMode: NodeDropInputMode
  
  /**
   * Gets or sets the policy that controls whether removing bends from an orthogonal edge will keep the edge orthogonal.
   * 
   * By default this feature is enabled automatically if an [OrthogonalEdgeEditingContext] is set. (Default is [AUTO][OrthogonalEdgeEditingPolicy]).
   * @see [orthogonalEdgeEditingContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23orthogonalBendRemoval">Online Documentation</a>
   */
  final var orthogonalBendRemoval: OrthogonalEdgeEditingPolicy
  
  /**
   * Gets or sets the orthogonal edge editing context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23orthogonalEdgeEditingContext">Online Documentation</a>
   */
  final var orthogonalEdgeEditingContext: OrthogonalEdgeEditingContext
  
  /**
   * Gets or sets which types of items should be selected after [paste][GraphEditorInputMode] or [duplicateSelection][GraphEditorInputMode].
   * 
   * The default is [ALL][GraphItemTypes].
   * @see [pasteSelectablePredicate]
   * @see [smartPasteSelection]
   * @see [GraphInputMode.setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23pasteSelectableItems">Online Documentation</a>
   */
  final var pasteSelectableItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item should be selected after [paste][GraphEditorInputMode] or [duplicateSelection][GraphEditorInputMode].
   * 
   * The default value returns the result of the [pasteSelectableItems][GraphEditorInputMode] property for the given item.
   * @see [pasteSelectableItems]
   * @see [paste]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23pasteSelectablePredicate">Online Documentation</a>
   */
  final var pasteSelectablePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets the [PortDropInputMode] that is responsible for handling drag and drop operations of ports onto the [graphComponent][GraphEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23portDropInputMode">Online Documentation</a>
   */
  final var portDropInputMode: PortDropInputMode
  
  /**
   * Gets or sets the [IReparentNodeHandler] that is used for moving nodes out of group nodes or into other group nodes.
   * @see [allowReparentNodes]
   * @see [ReparentNodeHandler]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23reparentNodeHandler">Online Documentation</a>
   */
  final var reparentNodeHandler: IReparentNodeHandler
  
  /**
   * Gets or sets a predicate that is queried to determine whether an edge should be reversed by [reverseEdge][GraphEditorInputMode], [reverseEdges][GraphEditorInputMode], or [reverseEdges][GraphEditorInputMode].
   * 
   * The default value returns the value of [allowReverseEdge][GraphEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23reversableEdgePredicate">Online Documentation</a>
   */
  final var reversableEdgePredicate: Predicate<IEdge>
  
  /**
   * Gets or sets a predicate that is queried to determine whether an item should be selected after creation.
   * 
   * The default value returns the result of the [creationSelectableItems][GraphEditorInputMode] property for the given item.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23selectAfterCreationPredicate">Online Documentation</a>
   */
  final var selectAfterCreationPredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets which types of items should have their [IHandle]s shown.
   * 
   * The default is [ALL][GraphItemTypes].
   * @see [showHandlePredicate]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23showHandleItems">Online Documentation</a>
   */
  final var showHandleItems: GraphItemTypes
  
  /**
   * Gets or sets a predicate that is queried to determine whether to show the [handles][GraphEditorInputMode] for the given item.
   * 
   * The default value returns the result of the [showHandleItems][GraphEditorInputMode] property for the given item.
   * @see [handleInputMode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23showHandlePredicate">Online Documentation</a>
   */
  final var showHandlePredicate: Predicate<IModelItem>
  
  /**
   * Gets or sets whether nodes, edges, labels, and ports should only be selected after [paste][GraphEditorInputMode] or [duplicateSelection][GraphEditorInputMode] if they were selected when they were initially copied into the clipboard.
   * @see [pasteSelectablePredicate]
   * @see [pasteSelectableItems]
   * @see [GraphInputMode.setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23smartPasteSelection">Online Documentation</a>
   */
  final var smartPasteSelection: Boolean
  
  /**
   * Gets or sets the [GraphSnapContext] instance that handles interactive snapping of elements during drag operations like movements.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23snapContext">Online Documentation</a>
   */
  final var snapContext: GraphSnapContext
  
  /**
   * Gets or sets a value indicating whether to use the [currentItem][GraphComponent] as a fallback for the commands if no item is provided in the parameter and the current selection is empty.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23useCurrentItemForCommands">Online Documentation</a>
   */
  final var useCurrentItemForCommands: Boolean
  
  /**
   * Gets or sets whether the user interaction should be blocked.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23waiting">Online Documentation</a>
   */
  open var waiting: Boolean
  
  /**
   * Updates the [contentBounds][yfiles.view.CanvasComponent] using [updateContentBounds][yfiles.view.CanvasComponent] and [contentMargins][GraphEditorInputMode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustContentBounds">Online Documentation</a>
   */
  open fun adjustContentBounds()
  
  /**
   * [Adjusts the size][yfiles.graph.IGraph] of the group nodes in the enumerable.
   * @param [nodes] The nodes to adjust their sizes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustGroupNodeSize">Online Documentation</a>
   */
  protected open fun adjustGroupNodeSize(
    nodes: IEnumerable<INode>,
  )
  
  /**
   * [Adjusts the size][yfiles.graph.IGraph] of the selected group nodes.
   * @see [adjustGroupNodeSize]
   * @see [Command.ADJUST_GROUP_NODE_SIZE]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustGroupNodeSizes">Online Documentation</a>
   */
  open fun adjustGroupNodeSizes()
  
  /**
   * Adjusts the node's [layout][INode] to adhere to possible [size constraints][INodeSizeConstraintProvider].
   * @param [node] The node to possibly adjust the size of.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustToSizeConstraints">Online Documentation</a>
   */
  open fun adjustToSizeConstraints(
    node: INode,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-childInputModeContextLookup">Online Documentation</a>
   */
  override fun childInputModeContextLookup(
    type: IClassMetadata<*>,
  ): Any?
  
  /**
   * Creates a node on a pointer click or tap.
   * @param [context] The context of the current input mode.
   * @param [location] The point where the pointer had been clicked.
   * @return `true` if a node was successfully created, `false` otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-clickCreateNode">Online Documentation</a>
   */
  protected open fun clickCreateNode(
    context: IInputModeContext,
    location: Point,
  ): Boolean
  
  /**
   * Creates a node at the given location.
   * @param [location] The point where the pointer click or tap has occured.
   * @return The newly created node, `null`, or a `Promise` resolving with a node or `null`.
   * @see [onNodeCreated]
   * @see [GraphInputMode.setCurrentItem]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createNode">Online Documentation</a>
   */
  open fun createNode(
    location: Point,
  ): PromiseResult<INode?> /* Promise<INode | null> | INode */?
  
  /**
   * Cuts and inserts the currently selected items to the clipboard.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-cut">Online Documentation</a>
   */
  open fun cut()
  
  /**
   * This method deletes the currently selected items.
   * @see [deleting-selection]
   * @see [deleted-item]
   * @see [deleted-selection]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-deleteSelection">Online Documentation</a>
   */
  open fun deleteSelection()
  
  /**
   * Actually performs a double-click on the given item.
   * @param [item] The item that has been double-clicked.
   * @param [event] The original event arguments for the click. Setting its [handled][ClickEventArgs] property to `true` will indicate that the double-click was handled and events on other items in the same location are no longer raised.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-doubleClick">Online Documentation</a>
   */
  override fun doubleClick(
    item: IModelItem,
    event: ClickEventArgs,
  )
  
  /**
   * Initiates the [handleInputMode][GraphEditorInputMode] to drag the given bend.
   * @param [bend] The bend to drag.
   * @see [onCreateBendInputModeDragSegmentFinished]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-dragBend">Online Documentation</a>
   */
  open fun dragBend(
    bend: IBend,
  )
  
  /**
   * Duplicates the selected items.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-duplicateSelection">Online Documentation</a>
   */
  open fun duplicateSelection()
  
  /**
   * Starts label editing by executing [EDIT_LABEL][Command].
   * @param [item] The item whose label or the label itself that should be edited upon the double click gesture.
   * @return `true` iff the request was handled.
   * @see [GraphInputMode.doubleClick]
   * @see [allowEditLabelOnDoubleClick]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-editLabelOnDoubleClick">Online Documentation</a>
   */
  protected open fun editLabelOnDoubleClick(
    item: IModelItem,
  ): Boolean
  
  /**
   * Creates a new group for all of the currently selected items.
   * @return The newly created group node or `null`.
   * @see [Command.GROUP_SELECTION]
   * @see [GraphInputMode.clearSelection]
   * @see [GraphInputMode.setSelected]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-groupSelection">Online Documentation</a>
   */
  open fun groupSelection(): INode?
  
  /**
   * Installs this mode into the provided context.
   * @param [context] The context to install this mode in and retrieve the graph and selection instance from.
   * @param [controller] The [ConcurrencyController] for this mode.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-install">Online Documentation</a>
   */
  override fun install(
    context: IInputModeContext,
    controller: ConcurrencyController,
  )
  
  /**
   * Lowers the visual representations of all [selected][GraphComponent] [IModelItem]s below their current predecessors.
   * @see [Command.LOWER]
   * @see [GraphModelManager.lower][yfiles.view.GraphModelManager.lower]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-lowerSelection">Online Documentation</a>
   */
  open fun lowerSelection()
  
  /**
   * Called when the [createBendInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onCreateBendInputModeChanged">Online Documentation</a>
   */
  protected open fun onCreateBendInputModeChanged(
    oldMode: CreateBendInputMode?,
    newMode: CreateBendInputMode,
  )
  
  /**
   * Called as soon as [CreateBendInputMode] created a new bend.
   * @param [event] The [InputModeItemEventArgs] that provides the new bend.
   * @param [sender] The element on which the event was triggered.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onCreateBendInputModeDragSegmentFinished">Online Documentation</a>
   */
  protected open fun onCreateBendInputModeDragSegmentFinished(
    event: InputModeItemEventArgs<IBend>,
    sender: IEventDispatcher,
  )
  
  /**
   * Called when the [createEdgeInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onCreateEdgeInputModeChanged">Online Documentation</a>
   */
  protected open fun onCreateEdgeInputModeChanged(
    oldMode: CreateEdgeInputMode?,
    newMode: CreateEdgeInputMode,
  )
  
  /**
   * Raises the [deleted-item][GraphEditorInputMode] event.
   * @param [event] The instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onDeletedItem">Online Documentation</a>
   */
  protected open fun onDeletedItem(
    event: InputModeItemChangedEventArgs<IModelItem, EventArgs>,
  )
  
  /**
   * Raises the [deleted-selection][GraphEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onDeletedSelection">Online Documentation</a>
   */
  protected open fun onDeletedSelection(
    event: ItemsEventArgs,
  )
  
  /**
   * Raises the [deleting-selection][GraphEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onDeletingSelection">Online Documentation</a>
   */
  protected open fun onDeletingSelection(
    event: SelectionEventArgs<IModelItem>,
  )
  
  /**
   * Invoked after an edge's source and/or target ports have been changed as the result of an input gesture.
   * @param [event] The [InputModeItemChangedEventArgs] for the [edge-ports-changed][GraphEditorInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onEdgePortsChanged">Online Documentation</a>
   */
  protected open fun onEdgePortsChanged(
    event: InputModeItemChangedEventArgs<IEdge, EdgeEventArgs>,
  )
  
  /**
   * Called when the [editLabelInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onEditLabelInputModeChanged">Online Documentation</a>
   */
  protected open fun onEditLabelInputModeChanged(
    oldMode: EditLabelInputMode?,
    newMode: EditLabelInputMode,
  )
  
  /**
   * Called when the [graphComponent][GraphEditorInputMode] property changes.
   * @param [oldGraphComponent] The old control.
   * @param [newGraphComponent] The new control.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGraphComponentChanged">Online Documentation</a>
   */
  protected open fun onGraphComponentChanged(
    oldGraphComponent: GraphComponent?,
    newGraphComponent: GraphComponent?,
  )
  
  /**
   * Called when the [IGraphSelection] property changes.
   * @param [oldSelection] The old selection instance.
   * @param [newSelection] The new selection instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGraphSelectionChanged">Online Documentation</a>
   */
  protected open fun onGraphSelectionChanged(
    oldSelection: IGraphSelection?,
    newSelection: IGraphSelection?,
  )
  
  /**
   * Raises the [grouped-selection][GraphEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGroupedSelection">Online Documentation</a>
   */
  protected open fun onGroupedSelection(
    event: SelectionEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [grouping-selection][GraphEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGroupingSelection">Online Documentation</a>
   */
  protected open fun onGroupingSelection(
    event: SelectionEventArgs<IModelItem>,
  )
  
  /**
   * Called when the [handleInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onHandleInputModeChanged">Online Documentation</a>
   */
  protected open fun onHandleInputModeChanged(
    oldMode: HandleInputMode?,
    newMode: HandleInputMode,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onKeyboardInputModeChanged">Online Documentation</a>
   */
  override fun onKeyboardInputModeChanged(
    oldMode: KeyboardInputMode?,
    newMode: KeyboardInputMode,
  )
  
  /**
   * Raises the [label-added][GraphEditorInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance that contains the [ILabel] that has been added.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelAdded">Online Documentation</a>
   */
  protected open fun onLabelAdded(
    event: InputModeItemEventArgs<ILabel>,
  )
  
  /**
   * Called when the [labelDropInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelDropInputModeChanged">Online Documentation</a>
   */
  protected open fun onLabelDropInputModeChanged(
    oldMode: LabelDropInputMode?,
    newMode: LabelDropInputMode,
  )
  
  /**
   * Called when the [labelDropInputMode][GraphEditorInputMode]'s [item-created][ItemDropInputMode] event is triggered.
   * @param [event] The event argument instance containing the event data.
   * @param [sender] The sender.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelDropInputModeLabelCreated">Online Documentation</a>
   */
  protected open fun onLabelDropInputModeLabelCreated(
    event: InputModeItemEventArgs<ILabel>,
    sender: IEventDispatcher,
  )
  
  /**
   * Raises the [label-edited][GraphEditorInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance that contains the [ILabel] that has changed the text.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelEdited">Online Documentation</a>
   */
  protected open fun onLabelEdited(
    event: InputModeItemEventArgs<ILabel>,
  )
  
  /**
   * Called when the [moveSelectedItemsInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onMoveSelectedItemsInputModeChanged">Online Documentation</a>
   */
  protected open fun onMoveSelectedItemsInputModeChanged(
    oldMode: MoveInputMode?,
    newMode: MoveInputMode,
  )
  
  /**
   * Called when the [moveUnselectedItemsInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onMoveUnselectedItemsInputModeChanged">Online Documentation</a>
   */
  protected open fun onMoveUnselectedItemsInputModeChanged(
    oldMode: MoveInputMode?,
    newMode: MoveInputMode,
  )
  
  /**
   * Raises the [node-created][GraphEditorInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance containing the created node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeCreated">Online Documentation</a>
   */
  protected open fun onNodeCreated(
    event: InputModeItemEventArgs<INode>,
  )
  
  /**
   * Called when the [nodeDropInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeDropInputModeChanged">Online Documentation</a>
   */
  protected open fun onNodeDropInputModeChanged(
    oldMode: NodeDropInputMode?,
    newMode: NodeDropInputMode,
  )
  
  /**
   * Called when the [nodeDropInputMode][GraphEditorInputMode]'s [item-created][ItemDropInputMode] event is triggered.
   * @param [event] The event argument instance containing the event data.
   * @param [sender] The sender.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeDropInputModeNodeCreated">Online Documentation</a>
   */
  protected open fun onNodeDropInputModeNodeCreated(
    event: InputModeItemEventArgs<INode>,
    sender: IEventDispatcher,
  )
  
  /**
   * Raises the [node-reparented][GraphEditorInputMode] event.
   * @param [event] The [InputModeItemChangedEventArgs] instance containing the event data. The [details][InputModeItemChangedEventArgs] are of type [NodeEventArgs] which provide the old parent in its [parent][NodeEventArgs] property.
   * @see [reparentNodeHandler]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeReparented">Online Documentation</a>
   */
  protected open fun onNodeReparented(
    event: InputModeItemChangedEventArgs<INode, NodeEventArgs>,
  )
  
  /**
   * Raises the [port-added][GraphEditorInputMode] event.
   * @param [event] The [InputModeItemEventArgs] instance that contains the [IPort] that has been added.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onPortAdded">Online Documentation</a>
   */
  protected open fun onPortAdded(
    event: InputModeItemEventArgs<IPort>,
  )
  
  /**
   * Called when the [portDropInputMode][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onPortDropInputModeChanged">Online Documentation</a>
   */
  protected open fun onPortDropInputModeChanged(
    oldMode: PortDropInputMode?,
    newMode: PortDropInputMode,
  )
  
  /**
   * Called when the [portDropInputMode][GraphEditorInputMode]'s [item-created][ItemDropInputMode] event is triggered.
   * @param [event] The event argument instance containing the event data.
   * @param [sender] The sender.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onPortDropInputModePortCreated">Online Documentation</a>
   */
  protected open fun onPortDropInputModePortCreated(
    event: InputModeItemEventArgs<IPort>,
    sender: IEventDispatcher,
  )
  
  /**
   * Called when the [reparentNodeHandler][GraphEditorInputMode] property value changes and after initialization of the property.
   * @param [oldMode] the old value, which may be `null` the first time
   * @param [newMode] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onReparentNodeHandlerChanged">Online Documentation</a>
   */
  protected open fun onReparentNodeHandlerChanged(
    oldMode: IReparentNodeHandler?,
    newMode: IReparentNodeHandler,
  )
  
  /**
   * Called when the [snapContext][GraphEditorInputMode] property context changed.
   * @param [oldContext] The old snap context.
   * @param [newContext] The new snap context.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onSnapContextChanged">Online Documentation</a>
   */
  protected open fun onSnapContextChanged(
    oldContext: GraphSnapContext?,
    newContext: GraphSnapContext?,
  )
  
  /**
   * Raises the [ungrouped-selection][GraphEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onUngroupedSelection">Online Documentation</a>
   */
  protected open fun onUngroupedSelection(
    event: SelectionEventArgs<IModelItem>,
  )
  
  /**
   * Raises the [ungrouping-selection][GraphEditorInputMode] event.
   * @param [event] The [SelectionEventArgs] instance containing the event data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onUngroupingSelection">Online Documentation</a>
   */
  protected open fun onUngroupingSelection(
    event: SelectionEventArgs<IModelItem>,
  )
  
  /**
   * Pastes the current clipboard contents.
   * @see [pasteAtLocation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-paste">Online Documentation</a>
   */
  open fun paste()
  
  /**
   * Pastes the current clipboard contents at the given location.
   * @param [location] The location at which the center of the clipboard's contents should be positioned.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-pasteAtLocation">Online Documentation</a>
   */
  open fun pasteAtLocation(
    location: Point,
  )
  
  /**
   * Raises the visual representations of all [selected][GraphComponent] [IModelItem]s above their current successors.
   * @see [Command.RAISE]
   * @see [GraphModelManager.raise][yfiles.view.GraphModelManager.raise]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-raiseSelection">Online Documentation</a>
   */
  open fun raiseSelection()
  
  /**
   * Redoes the last undone operation.
   * @see [undo]
   * @see [UndoEngine.redo][yfiles.graph.UndoEngine.redo]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-redo">Online Documentation</a>
   */
  open fun redo()
  
  /**
   * Re-evaluate all visible handles.
   * @throws InvalidOperationError When the [handleInputMode][GraphEditorInputMode] is active.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-requeryHandles">Online Documentation</a>
   */
  open fun requeryHandles()
  
  /**
   * Reverses the given edges.
   * @param [edge] The [IEdge] to reverse.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-reverseEdge">Online Documentation</a>
   */
  open fun reverseEdge(
    edge: IEdge,
  )
  
  /**
   * Reverses the given edges.
   * @param [edges] The [IEdge]s to reverse.
   * @see [Command.REVERSE_EDGE]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-reverseEdges">Online Documentation</a>
   */
  open fun reverseEdges(
    edges: IEnumerable<IEdge>,
  )
  
  /**
   * Reverses the selected edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-reverseSelectedEdges">Online Documentation</a>
   */
  open fun reverseSelectedEdges()
  
  /**
   * Selects the node and possible bends of self-loop edges.
   * @param [node] The node to select.
   * @see [autoSelectSelfLoopBends]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-selectNodeAndSelfLoopBends">Online Documentation</a>
   */
  open fun selectNodeAndSelfLoopBends(
    node: INode,
  )
  
  /**
   * Lowers the visual representations of all [selected][GraphComponent] [IModelItem]s to the back.
   * @see [Command.TO_BACK]
   * @see [GraphModelManager.toBack][yfiles.view.GraphModelManager.toBack]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-selectionToBack">Online Documentation</a>
   */
  open fun selectionToBack()
  
  /**
   * Raises the visual representations of all [selected][GraphComponent] [IModelItem]s to the front.
   * @see [Command.TO_FRONT]
   * @see [GraphModelManager.toFront][yfiles.view.GraphModelManager.toFront]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-selectionToFront">Online Documentation</a>
   */
  open fun selectionToFront()
  
  /**
   * Updates the bounds of the node.
   * @param [node] The node to reshape.
   * @param [layout] The new node layout.
   * @see [setNodeLocation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-setNodeLayout">Online Documentation</a>
   */
  open fun setNodeLayout(
    node: INode,
    layout: Rect,
  )
  
  /**
   * Updates the location of the node.
   * @param [node] The node to move.
   * @param [location] The new node location.
   * @see [setNodeLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-setNodeLocation">Online Documentation</a>
   */
  open fun setNodeLocation(
    node: INode,
    location: Point,
  )
  
  /**
   * Snaps the node to the grid using the [IGridConstraintProvider] for [INode]s queried from the given context.
   * @see [MultiplexingInputMode.createInputModeContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-snapToGrid">Online Documentation</a>
   */
  open fun snapToGrid(
    context: IInputModeContext,
    node: INode,
  )
  
  /**
   * Adds a new label to the given item interactively.
   * @param [owner] The item to add a label to.
   * @return A Promise that fulfills either with the edited label, or with `null` if [editing was canceled][TextEditorInputMode] or the text did not [validate][EditLabelInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-startLabelAddition">Online Documentation</a>
   */
  open fun startLabelAddition(
    owner: ILabelOwner,
  ): Promise<ILabel?>
  
  /**
   * Starts editing the given label.
   * @param [label] The label to edit.
   * @return A Promise that fulfills either with the edited label, or with `null` if [editing was canceled][TextEditorInputMode] or the text did not [validate][EditLabelInputMode].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-startLabelEditing">Online Documentation</a>
   */
  open fun startLabelEditing(
    label: ILabel,
  ): Promise<ILabel?>
  
  /**
   * Undoes the last operation.
   * @see [redo]
   * @see [UndoEngine.undo][yfiles.graph.UndoEngine.undo]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-undo">Online Documentation</a>
   */
  open fun undo()
  
  /**
   * Makes each of the currently selected nodes a direct child of the root group.
   * 
   * The default shortcut for this is `Ctrl+U`.
   * @see [Command.UNGROUP_SELECTION]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-ungroupSelection">Online Documentation</a>
   */
  open fun ungroupSelection()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-uninstall">Online Documentation</a>
   */
  override fun uninstall(
    context: IInputModeContext,
  )
  
  companion object : ClassMetadata<GraphEditorInputMode> {
    /**
     * An [IHitTestable] that tests if any [selected][IGraphSelection] model item that is [movable][GraphEditorInputMode] is hit.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23MOVE_SELECTED_ITEMS_HIT_TESTABLE">Online Documentation</a>
     */
     val MOVE_SELECTED_ITEMS_HIT_TESTABLE: IHitTestable
    
    /**
     * An [IPositionHandler] combining all position handlers of [selected][IGraphSelection] model items that are [movable][GraphEditorInputMode].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23MOVE_SELECTED_ITEMS_POSITION_HANDLER">Online Documentation</a>
     */
     val MOVE_SELECTED_ITEMS_POSITION_HANDLER: IPositionHandler
    
    /**
     * An [IHitTestable] that tests if any model item that is [movable][GraphEditorInputMode] is hit.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23MOVE_UNSELECTED_ITEMS_HIT_TESTABLE">Online Documentation</a>
     */
     val MOVE_UNSELECTED_ITEMS_HIT_TESTABLE: IHitTestable
    
    /**
     * An event handler setting the [IPositionHandler] of the [movable unselected][GraphEditorInputMode] model item that is hit at the [queryLocation][QueryPositionHandlerEventArgs].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23MOVE_UNSELECTED_ITEMS_QUERY_POSITION_HANDLER">Online Documentation</a>
     */
     val MOVE_UNSELECTED_ITEMS_QUERY_POSITION_HANDLER: EventHandler1<QueryPositionHandlerEventArgs>
  }
}

inline fun GraphEditorInputMode(
    block: GraphEditorInputMode.() -> Unit
): GraphEditorInputMode {
    return GraphEditorInputMode()
        .apply(block)
}

/**
 * `items-pasted`: Occurs when the [paste][GraphEditorInputMode] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23items-pasted">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addItemsPastedHandler(
  crossinline handler: (event:ItemsEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemsEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-pasted", listener)
  return { removeEventListener("items-pasted", listener) }
}

/**
 * `items-duplicated`: Occurs when the [duplicateSelection][GraphEditorInputMode] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23items-duplicated">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addItemsDuplicatedHandler(
  crossinline handler: (event:ItemsEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemsEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-duplicated", listener)
  return { removeEventListener("items-duplicated", listener) }
}

/**
 * `items-cut`: Occurs when the [cut][GraphEditorInputMode] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23items-cut">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addItemsCutHandler(
  crossinline handler: (event:ItemsEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemsEventArgs> = { event, _ -> handler(event) }
  addEventListener("items-cut", listener)
  return { removeEventListener("items-cut", listener) }
}

/**
 * `ungrouping-selection`: Occurs just before the [ungroupSelection][GraphEditorInputMode] method starts its work.
 * @see [addUngroupSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ungrouping-selection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addUngroupingSelectionHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("ungrouping-selection", listener)
  return { removeEventListener("ungrouping-selection", listener) }
}

/**
 * `ungrouped-selection`: Occurs after the [ungroupSelection][GraphEditorInputMode] method has ungrouped the selected items.
 * @see [addUngroupSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ungrouped-selection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addUngroupedSelectionHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("ungrouped-selection", listener)
  return { removeEventListener("ungrouped-selection", listener) }
}

/**
 * `grouping-selection`: Occurs just before the [groupSelection][GraphEditorInputMode] method starts its work.
 * @see [addGroupSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23grouping-selection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addGroupingSelectionHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("grouping-selection", listener)
  return { removeEventListener("grouping-selection", listener) }
}

/**
 * `grouped-selection`: Occurs after the [groupSelection][GraphEditorInputMode] method has grouped the selected items.
 * @see [addGroupSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23grouped-selection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addGroupedSelectionHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("grouped-selection", listener)
  return { removeEventListener("grouped-selection", listener) }
}

/**
 * `label-edited`: Occurs when this mode has triggered the edit of an [ILabel], for instance, in response to [startLabelEditing][GraphEditorInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23label-edited">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelEditedHandler(
  crossinline handler: (event:InputModeItemEventArgs<ILabel>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<ILabel>> = { event, _ -> handler(event) }
  addEventListener("label-edited", listener)
  return { removeEventListener("label-edited", listener) }
}

/**
 * `label-added`: Occurs when this mode has triggered the addition of an [ILabel], for instance, in response to [startLabelAddition][GraphEditorInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23label-added">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelAddedHandler(
  crossinline handler: (event:InputModeItemEventArgs<ILabel>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<ILabel>> = { event, _ -> handler(event) }
  addEventListener("label-added", listener)
  return { removeEventListener("label-added", listener) }
}

/**
 * `deleting-selection`: Occurs just before the [deleteSelection][GraphEditorInputMode] method starts its work and will be followed by any number of [deleted-item][GraphEditorInputMode] events and finalized by a [deleted-selection][GraphEditorInputMode] event.
 * @see [addDeleteSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23deleting-selection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addDeletingSelectionHandler(
  crossinline handler: (context:IInputModeContext, selection: IObservableCollection<IModelItem>) -> Unit
): () -> Unit {
  val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { event, _ -> handler(event.context, event.selection) }
  addEventListener("deleting-selection", listener)
  return { removeEventListener("deleting-selection", listener) }
}

/**
 * `deleted-item`: Occurs when an item has been deleted interactively by this mode.
 * @see [addDeleteSelectionHandler]
 * @see [addDeletingSelectionHandler]
 * @see [addDeletedSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23deleted-item">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addDeletedItemHandler(
  crossinline handler: (event:InputModeItemChangedEventArgs<IModelItem, EventArgs>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemChangedEventArgs<IModelItem, EventArgs>> = { event, _ -> handler(event) }
  addEventListener("deleted-item", listener)
  return { removeEventListener("deleted-item", listener) }
}

/**
 * `deleted-selection`: Occurs after all selected items have been removed in [deleteSelection][GraphEditorInputMode].
 * @see [addDeleteSelectionHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23deleted-selection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addDeletedSelectionHandler(
  crossinline handler: (event:ItemsEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemsEventArgs> = { event, _ -> handler(event) }
  addEventListener("deleted-selection", listener)
  return { removeEventListener("deleted-selection", listener) }
}

/**
 * `node-reparented`: Occurs when a node has been reparented interactively.
 * @see [addReparentNodeHandlerHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23node-reparented">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addNodeReparentedHandler(
  crossinline handler: (event:InputModeItemChangedEventArgs<INode, NodeEventArgs>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemChangedEventArgs<INode, NodeEventArgs>> = { event, _ -> handler(event) }
  addEventListener("node-reparented", listener)
  return { removeEventListener("node-reparented", listener) }
}

/**
 * `node-created`: Occurs when this mode has created a node in response to user interaction.
 * @see [addCreateNodeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23node-created">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addNodeCreatedHandler(
  crossinline handler: (event:InputModeItemEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("node-created", listener)
  return { removeEventListener("node-created", listener) }
}

/**
 * `edge-ports-changed`: Occurs after an edge's source and/or target ports have been changed as the result of an input gesture.
 * @see [InputModeItemChangedEventArgs]
 * @see [EdgeEventArgs]
 * @see [addReverseSelectedEdgesHandler]
 * @see [addReverseEdgesHandler]
 * @see [addReverseEdgeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23edge-ports-changed">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addEdgePortsChangedHandler(
  crossinline handler: (event:InputModeItemChangedEventArgs<IEdge, EdgeEventArgs>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemChangedEventArgs<IEdge, EdgeEventArgs>> = { event, _ -> handler(event) }
  addEventListener("edge-ports-changed", listener)
  return { removeEventListener("edge-ports-changed", listener) }
}

/**
 * `port-added`: Occurs when this mode has triggered the addition of an [IPort], for instance, in response to [portDropInputMode][GraphEditorInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23port-added">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addPortAddedHandler(
  crossinline handler: (event:InputModeItemEventArgs<IPort>) -> Unit
): () -> Unit {
  val listener: EventHandler1<InputModeItemEventArgs<IPort>> = { event, _ -> handler(event) }
  addEventListener("port-added", listener)
  return { removeEventListener("port-added", listener) }
}
