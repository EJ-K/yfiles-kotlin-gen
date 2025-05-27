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
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.graph.EdgeEventArgs
import yfiles.graph.GraphItemTypes
import yfiles.graph.IBend
import yfiles.graph.IEdge
import yfiles.graph.ILabel
import yfiles.graph.ILabelModelParameter
import yfiles.graph.ILabelOwner
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.graph.LabelEventArgs
import yfiles.graph.NodeEventArgs
import yfiles.graph.PortEventArgs
import yfiles.graph.Tag
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.ILabelStyle
import yfiles.view.GraphComponent
import yfiles.view.IGraphSelection
import yfiles.view.ISelectionModel

/**
 * A complex [IInputMode] that can be used in a [GraphComponent] to edit an [IGraph][yfiles.graph.IGraph] instance.
 * @see [createEdgeInputMode]
 * @see [createBendInputMode]
 * @see [moveLabelInputMode]
 * @see [nodeDropInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode">Online Documentation</a>
 * 
 * @constructor Creates a new instance that is not bound to an existing graph or selection, initially.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-constructor-GraphEditorInputMode">Online Documentation</a>
 */
external open class GraphEditorInputMode  () : GraphInputMode {

/**
 * Gets or sets a property that determines whether and how this instance should automatically adjust the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect] if the graph changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23adjustContentRectPolicy">Online Documentation</a>
 */
final var adjustContentRectPolicy: AdjustContentRectPolicy
/**
 * Gets or sets a value determining whether the [ICommand.ADD_LABEL] command should be handled.
 * @see [createLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowAddLabel">Online Documentation</a>
 */
final var allowAddLabel: Boolean
/**
 * Gets or sets a value determining whether the [ICommand.ADJUST_GROUP_NODE_SIZE] command should be handled.
 * @see [allowGroupingOperations]
 * @see [adjustGroupNodeSizes]
 * @see [adjustGroupNodeSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowAdjustGroupNodeSize">Online Documentation</a>
 */
final var allowAdjustGroupNodeSize: Boolean
/**
 * Gets or sets a value determining whether the [ICommand.DESELECT_ALL] command should be handled.
 * 
 * The default value is `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowClearSelection">Online Documentation</a>
 */
final var allowClearSelection: Boolean
/**
 * Gets or sets a value determining whether [bend creation][createBendInputMode] should be [enabled][CreateBendInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowCreateBend">Online Documentation</a>
 */
final var allowCreateBend: Boolean
/**
 * Gets or sets a value determining whether [edge creation][createEdgeInputMode] should be [enabled][CreateEdgeInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowCreateEdge">Online Documentation</a>
 */
final var allowCreateEdge: Boolean
/**
 * Gets or sets a value determining whether [node creation][createNode] by clicking on an empty canvas location is enabled.
 * @see [nodeCreator]
 * @see [createNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowCreateNode">Online Documentation</a>
 */
final var allowCreateNode: Boolean
/**
 * Gets or sets a value determining whether the [ICommand.DUPLICATE] command should be handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowDuplicate">Online Documentation</a>
 */
final var allowDuplicate: Boolean
/**
 * Gets or sets a value determining whether the [ICommand.EDIT_LABEL] command should be handled.
 * @see [editLabel]
 * @see [onEditLabel]
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
 * Gets or sets a value determining whether the [ICommand.GROUP_SELECTION] command should be handled.
 * @see [allowGroupingOperations]
 * @see [groupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowGroupSelection">Online Documentation</a>
 */
final var allowGroupSelection: Boolean
/**
 * Gets or sets a value indicating whether grouping operations like [grouping selected nodes][allowGroupSelection] or [moving nodes into group nodes][allowReparentNodes] should be enabled.
 * @see [allowGroupSelection]
 * @see [allowUngroupSelection]
 * @see [allowAdjustGroupNodeSize]
 * @see [allowReparentNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowGroupingOperations">Online Documentation</a>
 */
final var allowGroupingOperations: Boolean
/**
 * Gets or sets a value determining whether the [ICommand.PASTE] command should be handled.
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
 * Gets or sets a value indicating whether moving nodes into [non-group nodes][yfiles.graph.IGraph.isGroupNode] is allowed to convert them into group nodes.
 * @see [allowGroupingOperations]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowReparentToNonGroupNodes">Online Documentation</a>
 */
final var allowReparentToNonGroupNodes: Boolean
/**
 * Gets or sets a value indicating whether the [ICommand.REVERSE_EDGE] command should be handled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowReverseEdge">Online Documentation</a>
 */
final var allowReverseEdge: Boolean
/**
 * Gets or sets a value indicating whether undo operations, that is, [ICommand.UNDO] and [ICommand.REDO] should be enabled.
 * @see [undo]
 * @see [redo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowUndoOperations">Online Documentation</a>
 */
final var allowUndoOperations: Boolean
/**
 * Gets or sets a value determining whether the [ICommand.UNGROUP_SELECTION] command should be handled.
 * @see [allowGroupingOperations]
 * @see [ungroupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23allowUngroupSelection">Online Documentation</a>
 */
final var allowUngroupSelection: Boolean
/**
 * Gets or sets a value indicating whether this mode should automatically [remove labels][yfiles.graph.IGraph.remove] from the graph when a label text has been edited and the label text is empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23autoRemoveEmptyLabels">Online Documentation</a>
 */
final var autoRemoveEmptyLabels: Boolean
/**
 * Gets or sets a property that determines whether clicking on a node should automatically select all bends of self loops adjacent to that node.
 * 
 * The default value is `true`.
 * @see [GraphInputMode.clickSelectableItems]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23autoSelectSelfloopBends">Online Documentation</a>
 */
final var autoSelectSelfloopBends: Boolean
/**
 * Gets or sets the margins to use for [CanvasComponent.updateContentRect][yfiles.view.CanvasComponent.updateContentRect] in [adjustContentRect] calls.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23contentRectMargins">Online Documentation</a>
 */
final var contentRectMargins: Insets
/**
 * Gets or sets the [CreateBendInputMode] which handles interactive bend creation on existing edges.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23createBendInputMode">Online Documentation</a>
 */
final var createBendInputMode: CreateBendInputMode
/**
 * Gets or sets the [CreateEdgeInputMode] which handles interactive edge creation.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23createEdgeInputMode">Online Documentation</a>
 */
final var createEdgeInputMode: CreateEdgeInputMode
/**
 * Gets or sets which types of items may be deleted using the [deleteSelection] action.
 * 
 * The default is [GraphItemTypes.ALL].
 * @see [shouldDelete]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23deletableItems">Online Documentation</a>
 */
final var deletableItems: GraphItemTypes
/**
 * Gets or sets a predicate that is queried to determine whether an [IModelItem] can be deleted or not.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23deletablePredicate">Online Documentation</a>
 */
final var deletablePredicate: Predicate<IModelItem>?
/**
 * Gets the [graphComponent] instance this mode is working on or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23graphComponent">Online Documentation</a>
 */
final val graphComponent: GraphComponent?
/**
 * Gets or sets the [HandleInputMode] as child input mode.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23handleInputMode">Online Documentation</a>
 */
final var handleInputMode: HandleInputMode
/**
 * Gets or sets a property that determines whether the label should be hidden while it is edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23hideLabelDuringEditing">Online Documentation</a>
 */
final var hideLabelDuringEditing: Boolean
/**
 * Gets or sets the hitTester property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23hitTester">Online Documentation</a>
 */
final var hitTester: IHitTester<IModelItem>
/**
 * Gets or sets the [LabelDropInputMode] that is responsible for handling drag and drop operations of labels onto the [graphComponent].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23labelDropInputMode">Online Documentation</a>
 */
final var labelDropInputMode: LabelDropInputMode
/**
 * Gets or sets which types of items may have their [labels edited][onEditLabel].
 * 
 * The default is [GraphItemTypes.LABEL_OWNER]|[GraphItemTypes.LABEL], which allows for editing the labels of [ILabelOwner]s, and existing [ILabel]s.
 * @see [shouldEditLabel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23labelEditableItems">Online Documentation</a>
 */
final var labelEditableItems: GraphItemTypes
/**
 * Gets or sets the [LabelSnapContext] instance that handles interactive snapping of [ILabel]s to their owner during drag operations like movements.
 * @see [LabelSnapContext]
 * @see [snapContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23labelSnapContext">Online Documentation</a>
 */
final var labelSnapContext: SnapContext?
/**
 * Gets or sets which types of items should be movable using the [moveInputMode] or [moveLabelInputMode] respectively in case of labels.
 * 
 * The default is [GraphItemTypes.ALL].
 * @see [shouldMove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23movableItems">Online Documentation</a>
 */
final var movableItems: GraphItemTypes
/**
 * Gets or sets the [MoveInputMode] as child mode.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see [shouldMove]
 * @see [movableItems]
 * @see [moveUnselectedInputMode]
 * @see [moveLabelInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23moveInputMode">Online Documentation</a>
 */
final var moveInputMode: MoveInputMode
/**
 * Gets or sets the [MoveLabelInputMode] which handles interactive moving [ILabel]s.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see [shouldMove]
 * @see [moveInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23moveLabelInputMode">Online Documentation</a>
 */
final var moveLabelInputMode: MoveLabelInputMode
/**
 * Gets or sets the [MoveInputMode] which handles unselected graph items.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see [shouldMove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23moveUnselectedInputMode">Online Documentation</a>
 */
final var moveUnselectedInputMode: MoveInputMode
/**
 * Gets or sets the callback that is responsible for creating a new node, for instance, in response to a mouse click.
 * @see [createNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23nodeCreator">Online Documentation</a>
 */
final var nodeCreator: NodeCreationCallback?
/**
 * Gets or sets the [NodeDropInputMode] that is responsible for handling drag and drop operations of nodes onto the [graphComponent].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23nodeDropInputMode">Online Documentation</a>
 */
final var nodeDropInputMode: NodeDropInputMode
/**
 * Gets or sets the policy that controls whether removing bends from an orthogonal edge will keep the edge orthogonal.
 * 
 * By default this feature is enabled automatically if an [OrthogonalEdgeEditingContext] is set. (Default is [OrthogonalEdgeEditingPolicy.AUTO]).
 * @see [orthogonalEdgeEditingContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23orthogonalBendRemoval">Online Documentation</a>
 */
final var orthogonalBendRemoval: OrthogonalEdgeEditingPolicy
/**
 * Gets or sets the orthogonal edge editing context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23orthogonalEdgeEditingContext">Online Documentation</a>
 */
final var orthogonalEdgeEditingContext: OrthogonalEdgeEditingContext?
/**
 * Gets or sets the offset for paste operation if clipboard operations are enabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23pasteDelta">Online Documentation</a>
 */
final var pasteDelta: Point
/**
 * Gets or sets which types of items should be selected after [paste] or [duplicateSelection].
 * 
 * The default is [GraphItemTypes.ALL].
 * @see [shouldSelectAfterPaste]
 * @see [smartPasteSelection]
 * @see [GraphInputMode.setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23pasteSelectableItems">Online Documentation</a>
 */
final var pasteSelectableItems: GraphItemTypes
/**
 * Gets or sets the [PortDropInputMode] that is responsible for handling drag and drop operations of ports onto the [graphComponent].
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
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
 * Gets or sets which types of items should have their [IHandle]s shown.
 * 
 * The default is [GraphItemTypes.ALL].
 * @see [shouldShowHandles]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23showHandleItems">Online Documentation</a>
 */
final var showHandleItems: GraphItemTypes
/**
 * Gets or sets whether nodes, edges, labels, and ports should only be selected after [paste] or [duplicateSelection] if they were selected when they were initially copied into the clipboard.
 * @see [shouldSelectAfterPaste]
 * @see [pasteSelectableItems]
 * @see [GraphInputMode.setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23smartPasteSelection">Online Documentation</a>
 */
final var smartPasteSelection: Boolean
/**
 * Gets or sets the [SnapContext] instance that handles interactive snapping of elements during drag operations like movements.
 * @see [GraphSnapContext]
 * @see [labelSnapContext]
 * @see [LabelSnapContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23snapContext">Online Documentation</a>
 */
final var snapContext: SnapContext?
/**
 * Gets or sets the [TextEditorInputMode] which handles label editing.
 * @throws NotSupportedError If an attempt is made to change the instance while this mode is [installed][IInputMode.install]. To exchange a mode, first [IInputMode.uninstall], then [reinstall][IInputMode.install] to ensure that all data is initialized correctly.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23textEditorInputMode">Online Documentation</a>
 */
final var textEditorInputMode: TextEditorInputMode
/**
 * Gets or sets a handler which allows for configuring the [textEditorInputMode] during adding or editing labels.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23textEditorInputModeConfigurator">Online Documentation</a>
 */
final var textEditorInputModeConfigurator: TextEditorInputModeConfigurationHandler?
/**
 * Gets or sets a value indicating whether to use the [GraphComponent.currentItem] as a fallback for the commands if no item is provided in the parameter and the current selection is empty.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23useCurrentItemForCommands">Online Documentation</a>
 */
final var useCurrentItemForCommands: Boolean
/**
 * Gets or sets whether the user interaction should be blocked.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23waiting">Online Documentation</a>
 */
open var waiting: Boolean
/**
 * Adds a new label to the given item interactively.
 * @param [owner] The item to add a label to.
 * @return A Promise that fulfills with either the newly created label instance or `null` if the [editing was canceled][TextEditorInputMode.EditingCanceled] or the text did not [validate][ValidateLabelText].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-addLabel(ILabelOwner)">Online Documentation</a>
 */
 open   fun addLabel( owner: ILabelOwner ):Promise<ILabel?>
/**
 * Adds a label to the given `labelOwner` after the [textEditorInputMode] has successfully finished editing after [addLabel].
 * @param [labelOwner] The owner to add the label to.
 * @param [newText] The text of the new label.
 * @param [param] The label model parameter of the new label.
 * @param [style] The style of the new label.
 * @param [preferredSize] The preferred size of the new label.
 * @param [tag] The tag of the new Label.
 * @return The newly created label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-addLabel(ILabelOwner,string,ILabelModelParameter,ILabelStyle,Size,Object)">Online Documentation</a>
 */
 open   fun addLabel( labelOwner: ILabelOwner ,
 newText: String ,
 param: ILabelModelParameter?  = definedExternally,
 style: ILabelStyle?  = definedExternally,
 preferredSize: Size?  = definedExternally,
 tag: Tag?  = definedExternally):ILabel?
/**
 * Updates the [CanvasComponent.contentRect][yfiles.view.CanvasComponent.contentRect] using [CanvasComponent.updateContentRect][yfiles.view.CanvasComponent.updateContentRect] and [contentRectMargins]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustContentRect">Online Documentation</a>
 */
 open   fun adjustContentRect()
/**
 * [Adjusts the size][yfiles.graph.IGraph.adjustGroupNodeLayout] of the group nodes in the enumerable.
 * @param [nodes] The nodes to adjust their sizes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustGroupNodeSize">Online Documentation</a>
 */
 open protected   fun adjustGroupNodeSize( nodes: IEnumerable<INode> )
/**
 * [Adjusts the size][yfiles.graph.IGraph.adjustGroupNodeLayout] of the selected group nodes.
 * @see [adjustGroupNodeSize]
 * @see [ICommand.ADJUST_GROUP_NODE_SIZE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustGroupNodeSizes">Online Documentation</a>
 */
 open   fun adjustGroupNodeSizes()
/**
 * Adjusts the node's [INode.layout] to adhere to possible [size constraints][INodeSizeConstraintProvider].
 * @param [node] The node to possibly adjust the size of.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-adjustToSizeConstraints">Online Documentation</a>
 */
 open   fun adjustToSizeConstraints( node: INode )
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-childInputModeContextLookup">Online Documentation</a>
 */
 override   fun <T : YObject>childInputModeContextLookup( type: YClass<T> ):T?
/**
 * Creates a node on click.
 * @param [context] The input mode context.
 * @param [location] The location of the click.
 * @return `true` if a node was successfully created, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-clickCreateNode">Online Documentation</a>
 */
 open protected   fun clickCreateNode( context: IInputModeContext ,
 location: Point ):Boolean
/**
 * Closes the label editor if it is currently open.
 * @param [cancel] Whether to cancel the editor and discard changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-closeLabelEditor">Online Documentation</a>
 */
 open   fun closeLabelEditor( cancel: Boolean )
/**
 * Factory method for the [createBendInputMode] property.
 * @return a new instance of `CreateBendInputMode`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createCreateBendInputMode">Online Documentation</a>
 */
 open protected   fun createCreateBendInputMode():CreateBendInputMode
/**
 * Factory method for the [createEdgeInputMode] property.
 * @return a new instance of CreateEdgeInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createCreateEdgeInputMode">Online Documentation</a>
 */
 open protected   fun createCreateEdgeInputMode():CreateEdgeInputMode
/**
 * Factory method for the [handleInputMode] property.
 * @return a new instance of HandleInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createHandleInputMode">Online Documentation</a>
 */
 open protected   fun createHandleInputMode():HandleInputMode
/**
 * Interactively creates a new label for the provided label owner.
 * @param [owner] The item to create a new label for.
 * @return A Promise that fulfills either with the edited label, or with `null` if [editing was canceled][TextEditorInputMode.EditingCanceled] or the text did not [validate][ValidateLabelText].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createLabel">Online Documentation</a>
 */
 open   fun createLabel( owner: ILabelOwner ):Promise<ILabel?>
/**
 * Uses the [text editor][textEditorInputMode] to actually create a new label.
 * @param [event] The information for label creation.
 * @return A Promise that fulfills with either the newly created label instance or `null` if the [editing was canceled][TextEditorInputMode.EditingCanceled] or the text did not [validate][ValidateLabelText].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createLabelCore">Online Documentation</a>
 */
 open protected   fun createLabelCore( event: LabelEditingEventArgs ):Promise<ILabel?>
/**
 * Factory method that creates the [labelDropInputMode] lazily the first time the property is accessed.
 * @return A plain new instance of the [LabelDropInputMode] type, which is initially [disabled][DropInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createLabelDropInputMode">Online Documentation</a>
 */
 open protected   fun createLabelDropInputMode():LabelDropInputMode
/**
 * Factory method for the [moveInputMode] property.
 * @return a new instance of MoveInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createMoveInputMode">Online Documentation</a>
 */
 open protected   fun createMoveInputMode():MoveInputMode
/**
 * Factory method for the [moveLabelInputMode] property.
 * @return a new instance of [MoveLabelInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createMoveLabelInputMode">Online Documentation</a>
 */
 open protected   fun createMoveLabelInputMode():MoveLabelInputMode
/**
 * Factory method for the [moveUnselectedInputMode] property.
 * @return a new instance of MoveInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createMoveUnselectedInputMode">Online Documentation</a>
 */
 open protected   fun createMoveUnselectedInputMode():MoveInputMode
/**
 * Factory method for the [MoveViewportInputMode] property.
 * @return a new instance of [MoveViewportInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createMoveViewportInputMode">Online Documentation</a>
 */
 override   fun createMoveViewportInputMode():MoveViewportInputMode
/**
 * Creates a node given a certain click point.
 * @param [location] The point where the mouse had been clicked.
 * @return The newly created node, `null`, or a `Promise` resolving with a node or `null`.
 * @see [onNodeCreated]
 * @see [GraphInputMode.setCurrentItem]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createNode">Online Documentation</a>
 */
 open   fun createNode( location: Point ):PromiseResult<INode?> /* Promise<INode | null> | INode */?
/**
 * Factory method that creates the [nodeDropInputMode] lazily the first time the property is accessed.
 * @return A plain new instance of the [NodeDropInputMode] type, which is initially [disabled][DropInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createNodeDropInputMode">Online Documentation</a>
 */
 open protected   fun createNodeDropInputMode():NodeDropInputMode
/**
 * Factory method that creates the [portDropInputMode] lazily the first time the property is accessed.
 * @return A plain new instance of the [PortDropInputMode] type, which is initially [disabled][DropInputMode.enabled].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createPortDropInputMode">Online Documentation</a>
 */
 open protected   fun createPortDropInputMode():PortDropInputMode
/**
 * Factory method for the [reparentNodeHandler] property.
 * @return a new instance of [reparentNodeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createReparentNodeHandler">Online Documentation</a>
 */
 open protected   fun createReparentNodeHandler():IReparentNodeHandler
/**
 * Factory method for the [textEditorInputMode] property.
 * @return a new instance of TextEditorInputMode
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-createTextEditorInputMode">Online Documentation</a>
 */
 open protected   fun createTextEditorInputMode():TextEditorInputMode
/**
 * Cuts and inserts the currently selected elements to the clipboard.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-cut">Online Documentation</a>
 */
 open   fun cut()
/**
 * This method deletes the currently selected elements.
 * @see [addDeletingSelectionListener]
 * @see [addDeletedItemListener]
 * @see [addDeletedSelectionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-deleteSelection">Online Documentation</a>
 */
 open   fun deleteSelection()
/**
 * Actually performs a double-click on the given item.
 * @param [item] The item that has been double-clicked.
 * @param [event] The original event arguments for the click. Setting its [ClickEventArgs.handled] property to `true` will indicate that the double-click was handled and events on other items in the same location are no longer raised.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-doubleClick">Online Documentation</a>
 */
 override   fun doubleClick( item: IModelItem ,
 event: ClickEventArgs )
/**
 * Actually performs a double-tap on the given item.
 * @param [item] The item that has been double-tapped.
 * @param [event] The original event arguments for the tap. Setting its [TapEventArgs.handled] property to `true` will indicate that the double-tap was handled and events on other items in the same location are no longer raised.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-doubleTap">Online Documentation</a>
 */
 override   fun doubleTap( item: IModelItem ,
 event: TapEventArgs )
/**
 * Initiates the [handleInputMode] to drag the given bend.
 * @param [bend] The bend to drag.
 * @see [onCreateBendInputModeBendCreated]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-dragBend">Online Documentation</a>
 */
 open   fun dragBend( bend: IBend )
/**
 * Duplicates the selected elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-duplicateSelection">Online Documentation</a>
 */
 open   fun duplicateSelection()
/**
 * Starts editing the given label.
 * @param [label] The label to edit.
 * @return A Promise that fulfills either with the edited label, or with `null` if [editing was canceled][TextEditorInputMode.EditingCanceled] or the text did not [validate][ValidateLabelText].
 * @see [onLabelTextEdited]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-editLabel">Online Documentation</a>
 */
 open   fun editLabel( label: ILabel ):Promise<ILabel?>
/**
 * Core label edit method - opens a new [textEditorInputMode] input field.
 * @param [label] The label to edit.
 * @param [configurator] A callback to configure the [textEditorInputMode] before the label is edited.
 * @return A promise that resolves with either the label's text or a `null` if the text edit was canceled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-editLabelCore">Online Documentation</a>
 */
 open protected   fun editLabelCore( label: ILabel ,
 configurator: TextEditorInputModeConfigurationHandler? ):Promise<String?>
/**
 * Starts label editing by executing [ICommand.EDIT_LABEL].
 * @param [item] The item whose label or the label itself that should be edited upon the double click gesture.
 * @return `true` iff the request was handled.
 * @see [GraphInputMode.doubleClick]
 * @see [allowEditLabelOnDoubleClick]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-editLabelOnDoubleClick">Online Documentation</a>
 */
 open protected   fun editLabelOnDoubleClick( item: IModelItem ):Boolean
/**
 * Creates a new group for all of the currently selected elements.
 * @return The newly created group node or `null`.
 * @see [ICommand.GROUP_SELECTION]
 * @see [GraphInputMode.clearSelection]
 * @see [GraphInputMode.setSelected]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-groupSelection">Online Documentation</a>
 */
 open   fun groupSelection():INode?
/**
 * Installs this mode into the provided context.
 * @param [context] The context to install this mode in and retrieve the graph and selection instance from.
 * @param [controller] The [ConcurrencyController] for this mode.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-install">Online Documentation</a>
 */
 override   fun install( context: IInputModeContext ,
 controller: ConcurrencyController )
/**
 * Lowers the visual representations of all [selected][GraphComponent.selection] [IModelItem]s below their current predecessors.
 * @see [ICommand.LOWER]
 * @see [GraphModelManager.lower][yfiles.view.GraphModelManager.lower]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-lowerSelection">Online Documentation</a>
 */
 open   fun lowerSelection()
/**
 * Invoked if the shift+F2 key is pressed and [allowAddLabel] is set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onAddLabel">Online Documentation</a>
 */
 open protected   fun onAddLabel():Boolean
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onConcurrencyControllerActivated">Online Documentation</a>
 */
 override   fun onConcurrencyControllerActivated()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onConcurrencyControllerDeactivated">Online Documentation</a>
 */
 override   fun onConcurrencyControllerDeactivated()
/**
 * Called as soon as [CreateBendInputMode] created a new bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onCreateBendInputModeBendCreated">Online Documentation</a>
 */
 open protected   fun onCreateBendInputModeBendCreated( sender: IEventDispatcher ,
 event: ItemEventArgs<IBend> )
/**
 * Called when the [createBendInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onCreateBendInputModeChanged">Online Documentation</a>
 */
 open protected   fun onCreateBendInputModeChanged( oldMode: CreateBendInputMode? ,
 newMode: CreateBendInputMode )
/**
 * Called when the [createEdgeInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onCreateEdgeInputModeChanged">Online Documentation</a>
 */
 open protected   fun onCreateEdgeInputModeChanged( oldMode: CreateEdgeInputMode? ,
 newMode: CreateEdgeInputMode )
/**
 * Raises the [DeletedItem] event.
 * @param [event] The instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onDeletedItem">Online Documentation</a>
 */
 open protected   fun onDeletedItem( event: ItemEventArgs<IModelItem> )
/**
 * Raises the [DeletedSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onDeletedSelection">Online Documentation</a>
 */
 open protected   fun onDeletedSelection( event: SelectionEventArgs<IModelItem> )
/**
 * Raises the [DeletingSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onDeletingSelection">Online Documentation</a>
 */
 open protected   fun onDeletingSelection( event: SelectionEventArgs<IModelItem> )
/**
 * Invoked after an edge's source and/or target ports have been changed as the result of an input gesture.
 * @param [event] The [EdgeEventArgs] for the [EdgePortsChanged].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onEdgePortsChanged">Online Documentation</a>
 */
 open protected   fun onEdgePortsChanged( event: EdgeEventArgs )
/**
 * Invoked if the F2 key is pressed and [allowEditLabel] is set to `true`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onEditLabel">Online Documentation</a>
 */
 open protected   fun onEditLabel():Boolean
/**
 * Called when the [graphComponent] property changes.
 * @param [oldGraphComponent] The old control.
 * @param [newGraphComponent] The new control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGraphComponentChanged">Online Documentation</a>
 */
 open protected   fun onGraphComponentChanged( oldGraphComponent: GraphComponent? ,
 newGraphComponent: GraphComponent? )
/**
 * Called when the [GraphSelection][yfiles.view.GraphSelection] property changes.
 * @param [oldSelection] The old selection instance.
 * @param [newSelection] The new selection instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGraphSelectionChanged">Online Documentation</a>
 */
 open protected   fun onGraphSelectionChanged( oldSelection: IGraphSelection? ,
 newSelection: IGraphSelection )
/**
 * Raises the [GroupedSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGroupedSelection">Online Documentation</a>
 */
 open protected   fun onGroupedSelection( event: SelectionEventArgs<IModelItem> )
/**
 * Raises the [GroupingSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onGroupingSelection">Online Documentation</a>
 */
 open protected   fun onGroupingSelection( event: SelectionEventArgs<IModelItem> )
/**
 * Called when the [handleInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onHandleInputModeChanged">Online Documentation</a>
 */
 open protected   fun onHandleInputModeChanged( oldMode: HandleInputMode? ,
 newMode: HandleInputMode )
/**
 * Raises the [LabelAdded] event.
 * @param [event] The [ItemEventArgs] instance that contains the [ILabel] that has been added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelAdded">Online Documentation</a>
 */
 open protected   fun onLabelAdded( event: LabelEventArgs )
/**
 * Raises the [LabelAdding] event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelAdding">Online Documentation</a>
 */
 open protected   fun onLabelAdding( event: LabelEditingEventArgs )
/**
 * Called when the [labelDropInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelDropInputModeChanged">Online Documentation</a>
 */
 open protected   fun onLabelDropInputModeChanged( oldMode: LabelDropInputMode? ,
 newMode: LabelDropInputMode )
/**
 * Called when the [labelDropInputMode]'s [ItemDropInputMode.ItemCreated] event is triggered.
 * @param [sender] The sender.
 * @param [event] The event argument instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelDropInputModeLabelCreated">Online Documentation</a>
 */
 open protected   fun onLabelDropInputModeLabelCreated( sender: IEventDispatcher ,
 event: ItemEventArgs<ILabel> )
/**
 * Raises the [LabelEditing] event.
 * @param [event] The event arguments.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelEditing">Online Documentation</a>
 */
 open protected   fun onLabelEditing( event: LabelEditingEventArgs )
/**
 * Called when the [labelSnapContext] property context changed.
 * @param [oldContext] The old snap context.
 * @param [newContext] The new snap context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelSnapContextChanged">Online Documentation</a>
 */
 open protected   fun onLabelSnapContextChanged( oldContext: SnapContext? ,
 newContext: SnapContext? )
/**
 * Raises the [LabelTextChanged] event.
 * @param [event] The [ItemEventArgs] instance that contains the [ILabel] that has changed the text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelTextChanged">Online Documentation</a>
 */
 open protected   fun onLabelTextChanged( event: LabelEventArgs )
/**
 * Called when the text of a label has been [edited][editLabel].
 * @param [label] The label that was edited.
 * @param [text] The new text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelTextEdited">Online Documentation</a>
 */
 open protected   fun onLabelTextEdited( label: ILabel ,
 text: String ):Promise<Boolean>
/**
 * Raises the [LabelTextEditingCanceled] event.
 * @param [event] The [LabelEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelTextEditingCanceled">Online Documentation</a>
 */
 open protected   fun onLabelTextEditingCanceled( event: LabelEventArgs )
/**
 * Raises the [LabelTextEditingStarted] event.
 * @param [event] The [LabelEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onLabelTextEditingStarted">Online Documentation</a>
 */
 open protected   fun onLabelTextEditingStarted( event: LabelEventArgs )
/**
 * Called when the [moveInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onMoveInputModeChanged">Online Documentation</a>
 */
 open protected   fun onMoveInputModeChanged( oldMode: MoveInputMode? ,
 newMode: MoveInputMode )
/**
 * Called when the [moveLabelInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onMoveLabelInputModeChanged">Online Documentation</a>
 */
 open protected   fun onMoveLabelInputModeChanged( oldMode: MoveLabelInputMode? ,
 newMode: MoveLabelInputMode )
/**
 * Called when the [moveUnselectedInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onMoveUnselectedInputModeChanged">Online Documentation</a>
 */
 open protected   fun onMoveUnselectedInputModeChanged( oldMode: MoveInputMode? ,
 newMode: MoveInputMode )
/**
 * Raises the [NodeCreated] event.
 * @param [event] The [ItemEventArgs] instance containing the created node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeCreated">Online Documentation</a>
 */
 open protected   fun onNodeCreated( event: ItemEventArgs<INode> )
/**
 * Called when the [nodeDropInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeDropInputModeChanged">Online Documentation</a>
 */
 open protected   fun onNodeDropInputModeChanged( oldMode: NodeDropInputMode? ,
 newMode: NodeDropInputMode )
/**
 * Called when the [nodeDropInputMode]'s [ItemDropInputMode.ItemCreated] event is triggered.
 * @param [sender] The sender.
 * @param [event] The event argument instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeDropInputModeNodeCreated">Online Documentation</a>
 */
 open protected   fun onNodeDropInputModeNodeCreated( sender: IEventDispatcher ,
 event: ItemEventArgs<INode> )
/**
 * Raises the [NodeReparented] event.
 * @param [event] The [NodeEventArgs] instance containing the event data.
 * @see [reparentNodeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onNodeReparented">Online Documentation</a>
 */
 open protected   fun onNodeReparented( event: NodeEventArgs )
/**
 * Raises the [PortAdded] event.
 * @param [event] The [ItemEventArgs] instance that contains the [IPort] that has been added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onPortAdded">Online Documentation</a>
 */
 open protected   fun onPortAdded( event: PortEventArgs )
/**
 * Called when the [portDropInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onPortDropInputModeChanged">Online Documentation</a>
 */
 open protected   fun onPortDropInputModeChanged( oldMode: PortDropInputMode? ,
 newMode: PortDropInputMode )
/**
 * Called when the [portDropInputMode]'s [ItemDropInputMode.ItemCreated] event is triggered.
 * @param [sender] The sender.
 * @param [event] The event argument instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onPortDropInputModePortCreated">Online Documentation</a>
 */
 open protected   fun onPortDropInputModePortCreated( sender: IEventDispatcher ,
 event: ItemEventArgs<IPort> )
/**
 * Called when the [reparentNodeHandler] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onReparentNodeHandlerChanged">Online Documentation</a>
 */
 open protected   fun onReparentNodeHandlerChanged( oldMode: IReparentNodeHandler? ,
 newMode: IReparentNodeHandler )
/**
 * Called when the [snapContext] property context changed.
 * @param [oldContext] The old snap context.
 * @param [newContext] The new snap context.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onSnapContextChanged">Online Documentation</a>
 */
 open protected   fun onSnapContextChanged( oldContext: SnapContext? ,
 newContext: SnapContext? )
/**
 * Called when the [textEditorInputMode] property value changes and after initialization of the property.
 * @param [oldMode] the old value, which may be `null` the first time
 * @param [newMode] the new value
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onTextEditorInputModeChanged">Online Documentation</a>
 */
 open protected   fun onTextEditorInputModeChanged( oldMode: TextEditorInputMode? ,
 newMode: TextEditorInputMode )
/**
 * Raises the [UngroupedSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onUngroupedSelection">Online Documentation</a>
 */
 open protected   fun onUngroupedSelection( event: SelectionEventArgs<IModelItem> )
/**
 * Raises the [UngroupingSelection] event.
 * @param [event] The [SelectionEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onUngroupingSelection">Online Documentation</a>
 */
 open protected   fun onUngroupingSelection( event: SelectionEventArgs<IModelItem> )
/**
 * Raises the [ValidateLabelText] event.
 * @param [event] The [LabelTextValidatingEventArgs] instance containing the event data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-onValidateLabelText">Online Documentation</a>
 */
 open protected   fun onValidateLabelText( event: LabelTextValidatingEventArgs )
/**
 * Pastes the current clipboard contents.
 * @see [pasteAtLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-paste">Online Documentation</a>
 */
 open   fun paste()
/**
 * Pastes the current clipboard contents at the given location.
 * @param [location] The location at which the center of the clipboard's contents should be positioned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-pasteAtLocation">Online Documentation</a>
 */
 open   fun pasteAtLocation( location: Point )
/**
 * Raises the visual representations of all [selected][GraphComponent.selection] [IModelItem]s above their current successors.
 * @see [ICommand.RAISE]
 * @see [GraphModelManager.raise][yfiles.view.GraphModelManager.raise]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-raiseSelection">Online Documentation</a>
 */
 open   fun raiseSelection()
/**
 * Redoes the last undone operation.
 * @see [undo]
 * @see [UndoEngine.redo][yfiles.graph.UndoEngine.redo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-redo">Online Documentation</a>
 */
 open   fun redo()
/**
 * Re-evaluate all visible handles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-requeryHandles">Online Documentation</a>
 */
 open   fun requeryHandles()
/**
 * Reverses the given edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-reverseEdge">Online Documentation</a>
 */
 open   fun reverseEdge( edge: IEdge )
/**
 * Reverses the given edges.
 * @see [ICommand.REVERSE_EDGE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-reverseEdges">Online Documentation</a>
 */
 open   fun reverseEdges( edges: IEnumerable<IEdge> )
/**
 * Reverses the selected edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-reverseSelectedEdges">Online Documentation</a>
 */
 open   fun reverseSelectedEdges()
/**
 * Selects the node and possible bends of selfloop edges.
 * @param [node] The node to select.
 * @see [autoSelectSelfloopBends]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-selectNodeAndSelfloopBends">Online Documentation</a>
 */
 open   fun selectNodeAndSelfloopBends( node: INode )
/**
 * Lowers the visual representations of all [selected][GraphComponent.selection] [IModelItem]s to the back.
 * @see [ICommand.TO_BACK]
 * @see [GraphModelManager.toBack][yfiles.view.GraphModelManager.toBack]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-selectionToBack">Online Documentation</a>
 */
 open   fun selectionToBack()
/**
 * Raises the visual representations of all [selected][GraphComponent.selection] [IModelItem]s to the front.
 * @see [ICommand.TO_FRONT]
 * @see [GraphModelManager.toFront][yfiles.view.GraphModelManager.toFront]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-selectionToFront">Online Documentation</a>
 */
 open   fun selectionToFront()
/**
 * Sets the label's text after it has been [edited][editLabel].
 * @param [label] The label to set the text or remove.
 * @param [text] The new text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-setLabelText">Online Documentation</a>
 */
 open   fun setLabelText( label: ILabel ,
 text: String )
/**
 * Updates the bounds of the node.
 * @param [node] The node to reshape.
 * @param [layout] The new node layout.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-setNodeLayout">Online Documentation</a>
 */
 open   fun setNodeLayout( node: INode ,
 layout: Rect )
/**
 * Predicate that determines whether a label may be added interactively to `item`
 * @param [item] The item to query
 * @return `true` iff a label may be added
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-shouldAddLabel">Online Documentation</a>
 */
 open protected   fun shouldAddLabel( item: IModelItem ):Boolean
/**
 * Called to determine whether the given item should be deleted during [deleteSelection].
 * @param [item] The item.
 * @return Whether to delete that item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-shouldDelete">Online Documentation</a>
 */
 open protected   fun shouldDelete( item: IModelItem ):Boolean
/**
 * Called to determine whether the label or the labels of the provided item should be edited in response to [onEditLabel] or [onAddLabel].
 * @param [item] The item.
 * @return Whether to edit the label or the labels for that item.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-shouldEditLabel">Online Documentation</a>
 */
 open protected   fun shouldEditLabel( item: IModelItem ):Boolean
/**
 * Determines whether or not moving the item is allowed.
 * @param [item] The item to check.
 * @return Whether or not moving the item is allowed.
 * @see [movableItems]
 * @see [moveInputMode]
 * @see [moveLabelInputMode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-shouldMove">Online Documentation</a>
 */
 open protected   fun shouldMove( item: IModelItem ):Boolean
/**
 * Called to determine whether the given edge should be reversed by [reverseEdge], [reverseEdges], or [reverseEdges].
 * @param [edge] The edge which should be reversed.
 * @return `true` if the edge should be reversed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-shouldReverseEdge">Online Documentation</a>
 */
 open protected   fun shouldReverseEdge( edge: IEdge ):Boolean
/**
 * Can be overridden to determine which items should be selected after [paste] or [duplicateSelection].
 * @param [item] The item to check.
 * @return Whether to select the item after [paste] or [duplicateSelection].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-shouldSelectAfterPaste">Online Documentation</a>
 */
 open protected   fun shouldSelectAfterPaste( item: IModelItem ):Boolean
/**
 * Determines whether to show the [handles][handleInputMode] for the given item.
 * @param [item] The item to check
 * @return Whether to show the item based on the setting of the corresponding [showHandleItems], property.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-shouldShowHandles">Online Documentation</a>
 */
 open protected   fun shouldShowHandles( item: IModelItem ):Boolean
/**
 * Snaps the node to the grid using the [IGridConstraintProvider] for [INode]s queried from the given context.
 * @see [MultiplexingInputMode.createChildInputModeContext]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-snapToGrid">Online Documentation</a>
 */
 open   fun snapToGrid( context: IInputModeContext ,
 node: INode )
/**
 * Undoes the last operation.
 * @see [redo]
 * @see [UndoEngine.undo][yfiles.graph.UndoEngine.undo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-undo">Online Documentation</a>
 */
 open   fun undo()
/**
 * Makes each of the currently selected nodes a direct child of the root group.
 * 
 * The default shortcut for this is `Ctrl+U`.
 * @see [ICommand.UNGROUP_SELECTION]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-ungroupSelection">Online Documentation</a>
 */
 open   fun ungroupSelection()
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GraphEditorInputMode-method-uninstall">Online Documentation</a>
 */
 override   fun uninstall( context: IInputModeContext )
/**
 * Occurs when the [paste] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ElementsPasted">Online Documentation</a>
 */
fun addElementsPastedListener(listener: EventHandler1<EventArgs>)
fun removeElementsPastedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [duplicateSelection] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ElementsDuplicated">Online Documentation</a>
 */
fun addElementsDuplicatedListener(listener: EventHandler1<EventArgs>)
fun removeElementsDuplicatedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when the [cut] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ElementsCut">Online Documentation</a>
 */
fun addElementsCutListener(listener: EventHandler1<EventArgs>)
fun removeElementsCutListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs just before the [ungroupSelection] method starts its work.
 * @see [ungroupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23UngroupingSelection">Online Documentation</a>
 */
fun addUngroupingSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeUngroupingSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs after the [ungroupSelection] method has ungrouped the selected items.
 * @see [ungroupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23UngroupedSelection">Online Documentation</a>
 */
fun addUngroupedSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeUngroupedSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs just before the [groupSelection] method starts its work.
 * @see [groupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GroupingSelection">Online Documentation</a>
 */
fun addGroupingSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeGroupingSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs after the [groupSelection] method has grouped the selected items.
 * @see [groupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GroupedSelection">Online Documentation</a>
 */
fun addGroupedSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeGroupedSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs when this mode has triggered the addition of an [ILabel], for instance, in response to [createLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelAdded">Online Documentation</a>
 */
fun addLabelAddedListener(listener: EventHandler1<LabelEventArgs>)
fun removeLabelAddedListener(listener: EventHandler1<LabelEventArgs>)

/**
 * Occurs when the actual label editing process is about to start.
 * @see [addValidateLabelTextListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelTextEditingStarted">Online Documentation</a>
 */
fun addLabelTextEditingStartedListener(listener: EventHandler1<LabelEventArgs>)
fun removeLabelTextEditingStartedListener(listener: EventHandler1<LabelEventArgs>)

/**
 * Occurs when the actual label editing process is canceled.
 * @see [addValidateLabelTextListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelTextEditingCanceled">Online Documentation</a>
 */
fun addLabelTextEditingCanceledListener(listener: EventHandler1<LabelEventArgs>)
fun removeLabelTextEditingCanceledListener(listener: EventHandler1<LabelEventArgs>)

/**
 * Occurs when a label that is about to be [added][addLabel] or [edited][editLabel].
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ValidateLabelText">Online Documentation</a>
 */
fun addValidateLabelTextListener(listener: EventHandler1<LabelTextValidatingEventArgs>)
fun removeValidateLabelTextListener(listener: EventHandler1<LabelTextValidatingEventArgs>)

/**
 * Occurs when this mode has triggered the edit of an [ILabel], for instance, in response to [editLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelTextChanged">Online Documentation</a>
 */
fun addLabelTextChangedListener(listener: EventHandler1<LabelEventArgs>)
fun removeLabelTextChangedListener(listener: EventHandler1<LabelEventArgs>)

/**
 * Occurs just before the [deleteSelection] method starts its work and will be followed by any number of [DeletedItem] events and finalized by a [DeletedSelection] event.
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23DeletingSelection">Online Documentation</a>
 */
fun addDeletingSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeDeletingSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs when an item has been deleted interactively by this mode.
 * @see [deleteSelection]
 * @see [addDeletingSelectionListener]
 * @see [addDeletedSelectionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23DeletedItem">Online Documentation</a>
 */
fun addDeletedItemListener(listener: EventHandler1<ItemEventArgs<IModelItem>>)
fun removeDeletedItemListener(listener: EventHandler1<ItemEventArgs<IModelItem>>)

/**
 * Occurs after all selected items have been removed in [deleteSelection].
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23DeletedSelection">Online Documentation</a>
 */
fun addDeletedSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)
fun removeDeletedSelectionListener(listener: EventHandler1<SelectionEventArgs<IModelItem>>)

/**
 * Occurs when a node has been reparented interactively.
 * @see [reparentNodeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23NodeReparented">Online Documentation</a>
 */
fun addNodeReparentedListener(listener: EventHandler1<NodeEventArgs>)
fun removeNodeReparentedListener(listener: EventHandler1<NodeEventArgs>)

/**
 * Occurs when this mode has created a node in response to user interaction.
 * @see [createNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23NodeCreated">Online Documentation</a>
 */
fun addNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs after an edge's source and/or target ports have been changed as the result of an input gesture.
 * @see [EdgeEventArgs]
 * @see [reverseSelectedEdges]
 * @see [reverseEdges]
 * @see [reverseEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23EdgePortsChanged">Online Documentation</a>
 */
fun addEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)
fun removeEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * Occurs when this mode has triggered the addition of an [IPort], for instance, in response to [portDropInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23PortAdded">Online Documentation</a>
 */
fun addPortAddedListener(listener: EventHandler1<PortEventArgs>)
fun removePortAddedListener(listener: EventHandler1<PortEventArgs>)

/**
 * Occurs when a label is about to be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelAdding">Online Documentation</a>
 */
fun addLabelAddingListener(listener: EventHandler1<LabelEditingEventArgs>)
fun removeLabelAddingListener(listener: EventHandler1<LabelEditingEventArgs>)

/**
 * Occurs when a label is about to be edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelEditing">Online Documentation</a>
 */
fun addLabelEditingListener(listener: EventHandler1<LabelEditingEventArgs>)
fun removeLabelEditingListener(listener: EventHandler1<LabelEditingEventArgs>)

companion object : ClassMetadata<GraphEditorInputMode> {
/**
 * An [IHitTestable] that tests if any [selected][yfiles.view.GraphSelection] model item that is [movable][shouldMove] is hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23SELECTED_MOVABLES_HIT_TESTABLE">Online Documentation</a>
 */
 val SELECTED_MOVABLES_HIT_TESTABLE: IHitTestable
/**
 * An [IPositionHandler] combining all position handlers of [selected][yfiles.view.GraphSelection] model items that are [movable][shouldMove].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23SELECTED_MOVABLES_POSITION_HANDLER">Online Documentation</a>
 */
 val SELECTED_MOVABLES_POSITION_HANDLER: IPositionHandler
/**
 * An [IHitTestable] that tests if any model item that is [movable][shouldMove] is hit.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23UNSELECTED_MOVABLES_HIT_TESTABLE">Online Documentation</a>
 */
 val UNSELECTED_MOVABLES_HIT_TESTABLE: IHitTestable
/**
 * An event handler setting the [IPositionHandler] of the [movable][shouldMove] model item that is hit at the [query location][QueryPositionHandlerEventArgs.queryLocation].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23UNSELECTED_MOVABLES_QUERY_POSITION_HANDLER">Online Documentation</a>
 */
 val UNSELECTED_MOVABLES_QUERY_POSITION_HANDLER: EventHandler1<QueryPositionHandlerEventArgs>
}
}

inline fun GraphEditorInputMode(
    block: GraphEditorInputMode.() -> Unit
): GraphEditorInputMode {
    return GraphEditorInputMode()
        .apply(block)
}

/**
 * Occurs when the [paste] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ElementsPasted">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addElementsPastedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsPastedListener(listener)
    return { removeElementsPastedListener(listener) }
}
/**
 * Occurs when the [duplicateSelection] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ElementsDuplicated">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addElementsDuplicatedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsDuplicatedListener(listener)
    return { removeElementsDuplicatedListener(listener) }
}
/**
 * Occurs when the [cut] operation finished successfully.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ElementsCut">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addElementsCutHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addElementsCutListener(listener)
    return { removeElementsCutListener(listener) }
}
/**
 * Occurs just before the [ungroupSelection] method starts its work.
 * @see [ungroupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23UngroupingSelection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addUngroupingSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addUngroupingSelectionListener(listener)
    return { removeUngroupingSelectionListener(listener) }
}
/**
 * Occurs after the [ungroupSelection] method has ungrouped the selected items.
 * @see [ungroupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23UngroupedSelection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addUngroupedSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addUngroupedSelectionListener(listener)
    return { removeUngroupedSelectionListener(listener) }
}
/**
 * Occurs just before the [groupSelection] method starts its work.
 * @see [groupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GroupingSelection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addGroupingSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addGroupingSelectionListener(listener)
    return { removeGroupingSelectionListener(listener) }
}
/**
 * Occurs after the [groupSelection] method has grouped the selected items.
 * @see [groupSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23GroupedSelection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addGroupedSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addGroupedSelectionListener(listener)
    return { removeGroupedSelectionListener(listener) }
}
/**
 * Occurs when this mode has triggered the addition of an [ILabel], for instance, in response to [createLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelAdded">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelAddedHandler(
    crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEventArgs> = { _, event -> handler(event) }
    addLabelAddedListener(listener)
    return { removeLabelAddedListener(listener) }
}
/**
 * Occurs when the actual label editing process is about to start.
 * @see [addValidateLabelTextListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelTextEditingStarted">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelTextEditingStartedHandler(
    crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEventArgs> = { _, event -> handler(event) }
    addLabelTextEditingStartedListener(listener)
    return { removeLabelTextEditingStartedListener(listener) }
}
/**
 * Occurs when the actual label editing process is canceled.
 * @see [addValidateLabelTextListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelTextEditingCanceled">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelTextEditingCanceledHandler(
    crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEventArgs> = { _, event -> handler(event) }
    addLabelTextEditingCanceledListener(listener)
    return { removeLabelTextEditingCanceledListener(listener) }
}
/**
 * Occurs when a label that is about to be [added][addLabel] or [edited][editLabel].
 * @see [onValidateLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23ValidateLabelText">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addValidateLabelTextHandler(
    crossinline handler: (event:LabelTextValidatingEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelTextValidatingEventArgs> = { _, event -> handler(event) }
    addValidateLabelTextListener(listener)
    return { removeValidateLabelTextListener(listener) }
}
/**
 * Occurs when this mode has triggered the edit of an [ILabel], for instance, in response to [editLabel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelTextChanged">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelTextChangedHandler(
    crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEventArgs> = { _, event -> handler(event) }
    addLabelTextChangedListener(listener)
    return { removeLabelTextChangedListener(listener) }
}
/**
 * Occurs just before the [deleteSelection] method starts its work and will be followed by any number of [DeletedItem] events and finalized by a [DeletedSelection] event.
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23DeletingSelection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addDeletingSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addDeletingSelectionListener(listener)
    return { removeDeletingSelectionListener(listener) }
}
/**
 * Occurs when an item has been deleted interactively by this mode.
 * @see [deleteSelection]
 * @see [addDeletingSelectionListener]
 * @see [addDeletedSelectionListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23DeletedItem">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addDeletedItemHandler(
    crossinline handler: (item:IModelItem) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IModelItem>> = { _, event -> handler(event.item) }
    addDeletedItemListener(listener)
    return { removeDeletedItemListener(listener) }
}
/**
 * Occurs after all selected items have been removed in [deleteSelection].
 * @see [deleteSelection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23DeletedSelection">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addDeletedSelectionHandler(
    crossinline handler: (context:IInputModeContext, selection: ISelectionModel<IModelItem>) -> Unit
): () -> Unit {
    val listener: EventHandler1<SelectionEventArgs<IModelItem>> = { _, event -> handler(event.context, event.selection) }
    addDeletedSelectionListener(listener)
    return { removeDeletedSelectionListener(listener) }
}
/**
 * Occurs when a node has been reparented interactively.
 * @see [reparentNodeHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23NodeReparented">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addNodeReparentedHandler(
    crossinline handler: (event:NodeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<NodeEventArgs> = { _, event -> handler(event) }
    addNodeReparentedListener(listener)
    return { removeNodeReparentedListener(listener) }
}
/**
 * Occurs when this mode has created a node in response to user interaction.
 * @see [createNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23NodeCreated">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addNodeCreatedHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addNodeCreatedListener(listener)
    return { removeNodeCreatedListener(listener) }
}
/**
 * Occurs after an edge's source and/or target ports have been changed as the result of an input gesture.
 * @see [EdgeEventArgs]
 * @see [reverseSelectedEdges]
 * @see [reverseEdges]
 * @see [reverseEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23EdgePortsChanged">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addEdgePortsChangedHandler(
    crossinline handler: (event:EdgeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<EdgeEventArgs> = { _, event -> handler(event) }
    addEdgePortsChangedListener(listener)
    return { removeEdgePortsChangedListener(listener) }
}
/**
 * Occurs when this mode has triggered the addition of an [IPort], for instance, in response to [portDropInputMode].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23PortAdded">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addPortAddedHandler(
    crossinline handler: (event:PortEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<PortEventArgs> = { _, event -> handler(event) }
    addPortAddedListener(listener)
    return { removePortAddedListener(listener) }
}
/**
 * Occurs when a label is about to be added.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelAdding">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelAddingHandler(
    crossinline handler: (event:LabelEditingEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEditingEventArgs> = { _, event -> handler(event) }
    addLabelAddingListener(listener)
    return { removeLabelAddingListener(listener) }
}
/**
 * Occurs when a label is about to be edited.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphEditorInputMode%23LabelEditing">Online Documentation</a>
 */
inline fun  GraphEditorInputMode.addLabelEditingHandler(
    crossinline handler: (event:LabelEditingEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEditingEventArgs> = { _, event -> handler(event) }
    addLabelEditingListener(listener)
    return { removeLabelEditingListener(listener) }
}
