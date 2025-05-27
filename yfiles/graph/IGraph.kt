// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IEnumerable
import yfiles.collections.IListEnumerable
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Insets
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.Action
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher
import yfiles.lang.InterfaceMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ItemMapping
import yfiles.layout.LabelPreferredPlacementPolicy
import yfiles.layout.LayoutData
import yfiles.layout.PortAdjustmentPolicy
import yfiles.layout.PortLabelPolicy
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle
import yfiles.styles.IPortStyle

/**
 * Central interface that models a graph which can be displayed in a [canvas][yfiles.view.CanvasComponent] or [GraphComponent][yfiles.view.GraphComponent].
 * @see [DefaultGraph]
 * @see [INode]
 * @see [IEdge]
 * @see [IPort]
 * @see [ILabel]
 * @see [IBend]
 * @see [IMapperRegistry]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph">Online Documentation</a>
 */
external interface IGraph : ILookup, ITagOwner, IEventDispatcher {
/**
 * Gets a live view of all bends contained in this [IGraph].
 * @see [IEdge.bends]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23bends">Online Documentation</a>
 */
final val bends: IEnumerable<IBend>
/**
 * Gets a [GraphDecorator] instance for use with this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23decorator">Online Documentation</a>
 */
final val decorator: GraphDecorator
/**
 * Gets or sets the defaults for edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23edgeDefaults">Online Documentation</a>
 */
var edgeDefaults: IEdgeDefaults
/**
 * Gets a live view of all edge labels contained in this [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23edgeLabels">Online Documentation</a>
 */
final val edgeLabels: IEnumerable<ILabel>
/**
 * Gets a view of the edges contained in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23edges">Online Documentation</a>
 */
val edges: IListEnumerable<IEdge>
/**
 * Gets the [folding view][IFoldingView] instance associated with this [IGraph] or `null` if none is associated with it.
 * @see [FoldingManager]
 * @see [FoldingManager.createFoldingView]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23foldingView">Online Documentation</a>
 */
final val foldingView: IFoldingView?
/**
 * Gets or sets the defaults for group nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23groupNodeDefaults">Online Documentation</a>
 */
var groupNodeDefaults: INodeDefaults
/**
 * Creates a [GroupingSupport] instance for the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23groupingSupport">Online Documentation</a>
 */
final val groupingSupport: GroupingSupport
/**
 * Gets a view of the labels contained in this graph.
 * @see [nodeLabels]
 * @see [edgeLabels]
 * @see [portLabels]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23labels">Online Documentation</a>
 */
val labels: IListEnumerable<ILabel>
/**
 * Gets the mapper registry that is associated with this graph instance.
 * @see [IMapperRegistry]
 * @see [IModelItem]
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23mapperRegistry">Online Documentation</a>
 */
val mapperRegistry: IMapperRegistry
/**
 * Gets or sets the defaults for normal nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23nodeDefaults">Online Documentation</a>
 */
var nodeDefaults: INodeDefaults
/**
 * Gets a live view of all node labels contained in this [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23nodeLabels">Online Documentation</a>
 */
final val nodeLabels: IEnumerable<ILabel>
/**
 * Gets a view of the nodes contained in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23nodes">Online Documentation</a>
 */
val nodes: IListEnumerable<INode>
/**
 * Gets a live view of all port labels contained in this [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23portLabels">Online Documentation</a>
 */
final val portLabels: IEnumerable<ILabel>
/**
 * Gets a view of the ports contained in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23ports">Online Documentation</a>
 */
val ports: IListEnumerable<IPort>
/**
 * Gets the [UndoEngine] instance associated with this [IGraph] or `null` if none is associated with it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23undoEngine">Online Documentation</a>
 */
final val undoEngine: UndoEngine?
/**
 * Gets or sets whether or not the [UndoEngine] used for this instance should be enabled.
 * @see [undoEngine]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23undoEngineEnabled">Online Documentation</a>
 */
final var undoEngineEnabled: Boolean
/**
 * Adds a bend at the given index to the given edge using the coordinates provided.
 * @param [edge] The edge to which the bend will be added.
 * @param [location] the coordinates to use for the newly created bend. To change the location after the bend has been added, use [setBendLocation].
 * @param [index] The index for the newly added bend; a negative value (which is the default) indicates that the bend should be appended to the end of the list of bends.
 * @return a newly created live bend
 * @throws ArgumentError `edge` is not in this graph, or `location` contains one or more `NaN` values.
 * @see [remove]
 * @see [setBendLocation]
 * @see [IEdge.bends]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-addBend">Online Documentation</a>
 */
   fun addBend( edge: IEdge ,
 location: Point ,
 index: Int  = definedExternally):IBend
/**
 * Adds bends with the given locations to the end of the bend list of the given edge.
 * @param [edge] The edge to add the bends to.
 * @param [locations] The locations of the bends.
 * @throws ArgumentError `edge` is not in this graph.
 * @throws ArgumentError `locations` contains one or more `NaN` values.
 * @see [addBend]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-addBends">Online Documentation</a>
 */
  final  fun addBends( edge: IEdge ,
 locations: IEnumerable<Point> ):Unit = definedExternally
/**
 * Add a label to the given node or edge using the text as the initial label text and label model parameter, style and tag.
 * @param [owner] The node, edge or port to add the label to. Note that the owner cannot be changed after the label has been added.
 * @param [text] The initial text of the label. To change the text after the label has been added, use [setLabelText].
 * @param [layoutParameter] The label model parameter instance to use. If omitted the [default parameter][ILabelDefaults] will be set. To change the parameter after the label has been added, use [setLabelLayoutParameter].
 * @param [style] The style to use for the label. If omitted the [default style][ILabelDefaults] will be set. To change the style after the label has been added, use [setStyle].
 * @param [preferredSize] The initial values to use for the [ILabel.preferredSize]. If omitted size will be determined automatically. To change the preferred size after the label has been added, use [setLabelPreferredSize].
 * @param [tag] The initial [ITagOwner.tag] to assign.
 * @return the newly created label
 * @throws ArgumentError `owner` is not in this graph or `preferredSize` contains one or more `NaN` values.
 * @see [addLabelAddedListener]
 * @see [setLabelText]
 * @see [ILabel.text]
 * @see [setLabelLayoutParameter]
 * @see [ILabel.layoutParameter]
 * @see [setStyle]
 * @see [ILabel.style]
 * @see [setLabelPreferredSize]
 * @see [ILabel.preferredSize]
 * @see [ILabel.owner]
 * @see [VoidLabelStyle.INSTANCE][yfiles.styles.VoidLabelStyle.INSTANCE]
 * @see [INodeDefaults.labels]
 * @see [IEdgeDefaults.labels]
 * @see [IPortDefaults.labels]
 * @see [ILabelOwner.labels]
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-addLabel">Online Documentation</a>
 */
   fun addLabel( owner: ILabelOwner ,
 text: String ,
 layoutParameter: ILabelModelParameter?  = definedExternally,
 style: ILabelStyle?  = definedExternally,
 preferredSize: Size?  = definedExternally,
 tag: Tag?  = definedExternally):ILabel
/**
 * Add a port to the given port owner using the location model parameter, style and tag.
 * @param [owner] the owner to add the port instance to.
 * @param [locationParameter] the parameter to use for the port to determine its location. If omitted the [default parameter][IPortDefaults] will be set. To change the parameter after the port has been added, use [setPortLocationParameter].
 * @param [style] the style to initially assign to the [IPort.style] property. If omitted the [default style][IPortDefaults] will be set, e.g. [VoidPortStyle.INSTANCE][yfiles.styles.VoidPortStyle.INSTANCE]. To change the style after the port has been added, use [setStyle].
 * @param [tag] the initial [ITagOwner.tag] to assign.
 * @return the newly created port
 * @throws NotSupportedError If this instance cannot add a port to `owner`.
 * @throws ArgumentError `owner` is not in this graph.
 * @see [addPortAddedListener]
 * @see [VoidPortStyle.INSTANCE][yfiles.styles.VoidPortStyle.INSTANCE]
 * @see [setPortLocationParameter]
 * @see [IPort.locationParameter]
 * @see [setStyle]
 * @see [IPort.style]
 * @see [INodeDefaults.ports]
 * @see [IEdgeDefaults.ports]
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-addPort">Online Documentation</a>
 */
   fun addPort( owner: IPortOwner ,
 locationParameter: IPortLocationModelParameter?  = definedExternally,
 style: IPortStyle?  = definedExternally,
 tag: Tag?  = definedExternally):IPort
/**
 * Add a port to the given port owner using the absolute coordinates as the new initial position of the port anchor.
 * @param [owner] the owner to add the port instance to.
 * @param [location] the location to use for the port to determine its location. This is passed to the [createDefaultPortLocationParameter] method to determine the initial [IPortLocationModelParameter] to use.
 * @param [style] the style to initially assign to the [IPort.style] property, e.g. [VoidPortStyle.INSTANCE][yfiles.styles.VoidPortStyle.INSTANCE].
 * @param [tag] the initial [ITagOwner.tag] to assign.
 * @return the newly created port
 * @throws NotSupportedError If this instance cannot add a port to `owner`.
 * @throws ArgumentError `owner` is not in this graph.
 * @throws ArgumentError `location` contains one or more `NaN` values.
 * @see [addPort]
 * @see [setPortLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-addPortAt">Online Documentation</a>
 */
  final  fun addPortAt( owner: IPortOwner ,
 location: Point ,
 style: IPortStyle?  = definedExternally,
 tag: Tag?  = definedExternally):IPort = definedExternally
/**
 * Adds a new port to the graph at the node using a location that is relative to the center of the node.
 * @param [node] The owner of the port.
 * @param [relativeLocation] The offset of the port relative to the center of the [INode.layout].
 * @return The newly added port instance.
 * @throws ArgumentError `node` is not in this graph.
 * @throws ArgumentError `relativeLocation` contains one or more `NaN` values.
 * @see [addPort]
 * @see [addPortAt]
 * @see [setRelativePortLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-addRelativePort">Online Documentation</a>
 */
  final  fun addRelativePort( node: INode ,
 relativeLocation: Point ):IPort = definedExternally
/**
 * Convenience method that uses the [UndoEngine] from the [IGraph]'s [ILookup] to [add a unit][UndoEngine.addUnit].
 * @param [undoName] The name of the undo operation.
 * @param [redoName] The name of the redo operation.
 * @param [undo] The undo action.
 * @param [redo] The redo action.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-addUndoUnit">Online Documentation</a>
 */
  final  fun addUndoUnit( undoName: String ,
 redoName: String ,
 undo: Action ,
 redo: Action ):Unit = definedExternally
/**
 * Method to adjust the size of a group node.
 * @param [groupNode] The group node to adjust the size of.
 * @throws ArgumentError `groupNode` is not in this graph.
 * @see [IGroupBoundsCalculator]
 * @see [INodeSizeConstraintProvider][yfiles.input.INodeSizeConstraintProvider]
 * @see [GroupingSupport.calculateMinimumEnclosedArea]
 * @see [GroupingSupport.enlargeGroupNode]
 * @see [GroupingSupport.enlargeAllGroupNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-adjustGroupNodeLayout">Online Documentation</a>
 */
  final  fun adjustGroupNodeLayout( groupNode: INode ):Unit = definedExternally
/**
 * Adjusts the [ILabel.preferredSize] property of a label to fit the suggested size of its [ILabelStyleRenderer].
 * @param [label] The label to adjust the size for.
 * @see [ILabelDefaults.autoAdjustPreferredSize]
 * @see [setLabelPreferredSize]
 * @see [ILabel.preferredSize]
 * @see [calculateLabelPreferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-adjustLabelPreferredSize">Online Documentation</a>
 */
  final  fun adjustLabelPreferredSize( label: ILabel ):Unit = definedExternally
/**
 * Runs an [ILayoutAlgorithm] synchronously on the given graph.
 * @param [layout] The layout.
 * @param [layoutData] The layout data.
 * @param [updateContentRect] A value indicating whether the content rectangle property of the [CanvasComponent][yfiles.view.CanvasComponent]
 * @param [automaticEdgeGrouping] A value indicating whether edge groups are automatically created for edges that are connected to the same port.
 * @param [configureTableLayout] A value indicating whether to automatically perform calls to [TableLayoutConfigurator.prepare][yfiles.layout.TableLayoutConfigurator.prepare] and [TableLayoutConfigurator.restore][yfiles.layout.TableLayoutConfigurator.restore] in order to layout table nodes.
 * @param [considerViewportLimiter] A value that controls whether strong port constraints are automatically created.
 * @param [fixPorts] A value that controls whether strong port constraints are automatically created.
 * @param [hideEdgesAtEdges] A value that controls whether edges at other edges will be hidden from the layout graph or included.
 * @param [portAdjustmentPolicy] The policy that specifies how port locations should be adjusted after a layout has been calculated.
 * @param [portLabelPolicies] Sets how [ILabel]s at [IPort]s should be treated by the layout algorithm.
 * @param [targetBoundsInsets] the insets (in world coordinates) that will be added to the content rectangle when calculating the target viewport.
 * @param [labelPreferredPlacementPolicy] The policy that specifies how edge labels should be treated by the layout algorithm.
 * @see [LayoutExecutor][yfiles.layout.LayoutExecutor]
 * @see [GraphComponent.morphLayout][yfiles.view.GraphComponent.morphLayout]
 * @see [YClass.ensure][yfiles.lang.YClass.ensure]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-applyLayout">Online Documentation</a>
 */
  final  fun applyLayout( layout: ILayoutAlgorithm ,
 layoutData: LayoutData?  = definedExternally,
 updateContentRect: Boolean  = definedExternally,
 automaticEdgeGrouping: Boolean  = definedExternally,
 configureTableLayout: Boolean  = definedExternally,
 considerViewportLimiter: Boolean  = definedExternally,
 fixPorts: Boolean  = definedExternally,
 hideEdgesAtEdges: Boolean  = definedExternally,
 portAdjustmentPolicy: PortAdjustmentPolicy  = definedExternally,
 portLabelPolicies: ItemMapping<ILabel, PortLabelPolicy>?  = definedExternally,
 targetBoundsInsets: Insets?  = definedExternally,
 labelPreferredPlacementPolicy: LabelPreferredPlacementPolicy  = definedExternally):Unit = definedExternally
/**
 * Starts an [ICompoundEdit] that records graph changes and [custom undo units][addUndoUnit] in a single compound unit.
 * @param [undoName] The undo name for the compound edit.
 * @param [redoName] The redo name for the compound edit.
 * @return The handle to stop the recording by calling [ICompoundEdit.cancel] or [ICompoundEdit.commit] on it.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-beginEdit(string,string)">Online Documentation</a>
 */
  final  fun beginEdit( undoName: String ,
 redoName: String ):ICompoundEdit = definedExternally
/**
 * Starts an [ICompoundEdit] that uses the [memento design pattern][IMementoSupport] to record changes to the items in the given `items` collection.
 * @param [T] The type of the items that will be modified subsequently.
 * @param [undoName] The [IUndoUnit.undoName] of the [IUndoUnit] that will be placed into the undo queue after [ICompoundEdit.commit] has been called.
 * @param [redoName] The [IUndoUnit.redoName] of the [IUndoUnit] that will be placed into the undo queue after [ICompoundEdit.commit] has been called.
 * @param [items] The items that will be changed after this call and before the call to [ICompoundEdit.commit].
 * @param [provider] The provider for the [IMementoSupport] of the `items`. if the provider returns `null` for a given item, changes to this item are not being recorded.
 * @return An implementation of the [ICompoundEdit] interface whose [ICompoundEdit.commit] or [ICompoundEdit.cancel] methods need to be called after the items have been modified.
 * @see [IMementoSupport]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-beginEdit(string,string,IEnumerable,MementoSupportProvider)">Online Documentation</a>
 */
  final  fun <T>beginEdit( undoName: String ,
 redoName: String ,
 items: IEnumerable<T> ,
 provider: MementoSupportProvider<T>?  = definedExternally):ICompoundEdit = definedExternally
/**
 * Calculates the preferred size of a label with the given properties.
 * @param [owner] The item that will own the label.
 * @param [text] The text.
 * @param [layoutParameter] The label model parameter.
 * @param [style] The label style.
 * @param [tag] The tag for the label.
 * @return The size as calculated by the [ILabelStyleRenderer].
 * @see [setLabelPreferredSize]
 * @see [ILabel.preferredSize]
 * @see [adjustLabelPreferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-calculateLabelPreferredSize">Online Documentation</a>
 */
  final  fun calculateLabelPreferredSize( owner: ILabelOwner ,
 text: String ,
 layoutParameter: ILabelModelParameter?  = definedExternally,
 style: ILabelStyle?  = definedExternally,
 tag: Tag?  = definedExternally):Size = definedExternally
/**
 * Clears the graph, removing all items in proper order.
 * @see [remove]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-clear">Online Documentation</a>
 */
  final  fun clear():Unit = definedExternally
/**
 * Removes all bends from the given edge.
 * @param [edge] the edge whose bends will be removed
 * @throws ArgumentError `edge` is not in this graph.
 * @see [remove]
 * @see [addBendRemovedListener]
 * @see [IEdge.bends]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-clearBends">Online Documentation</a>
 */
  final  fun clearBends( edge: IEdge ):Unit = definedExternally
/**
 * Determines whether this graph contains the specified item.
 * @param [item] The item.
 * @return `true` if this graph contains the specified item; otherwise, `false`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-contains">Online Documentation</a>
 */
  operator fun contains( item: IModelItem ):Boolean
/**
 * Creates the label layout parameter for a given [ILabelOwner].
 * @param [owner] The item that is the [ILabel.owner] of the label in question.
 * @return The default label layout parameter to use for newly created labels at the item.
 * @see [ILabelDefaults.getLayoutParameterInstance]
 * @see [getLabelDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-createDefaultLabelLayoutParameter">Online Documentation</a>
 */
  final  fun createDefaultLabelLayoutParameter( owner: ILabelOwner ):ILabelModelParameter = definedExternally
/**
 * Creates a location model parameter for a newly created [IPort] at the `owner` that matches the `location`.
 * @param [owner] The owner of the port.
 * @param [location] The location in the world coordinate system where the port should be added.
 * @return Either a location model parameter that matches the location, or the default parameter to use for the [IPortOwner] as returned by [IPortDefaults.getLocationParameterInstance].
 * @throws ArgumentError `location` contains one or more `NaN` values.
 * @see [IPortLocationModel.createParameter]
 * @see [getPortDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-createDefaultPortLocationParameter">Online Documentation</a>
 */
  final  fun createDefaultPortLocationParameter( owner: IPortOwner ,
 location: Point?  = definedExternally):IPortLocationModelParameter = definedExternally
/**
 * Creates and returns an edge that connects to the given port instances.
 * @param [sourcePort] The source port the created edge will connect to. To change the source port after the edge has been created, use [setEdgePorts].
 * @param [targetPort] The target port the created edge will connect to. To change the target port after the edge has been created, use [setEdgePorts].
 * @param [style] The style instance that will be assigned to the newly created instance. This is done by reference. If omitted the [default style][edgeDefaults] will be set. To change the style after the edge has been created, use [setStyle].
 * @param [tag] The initial value of the [ITagOwner.tag] that will be assigned to the new edge.
 * @return the newly created edge instance
 * @see [addEdgeCreatedListener]
 * @see [VoidEdgeStyle.INSTANCE][yfiles.styles.VoidEdgeStyle.INSTANCE]
 * @see [edgeDefaults]
 * @see [setEdgePorts]
 * @see [IEdge.sourcePort]
 * @see [IEdge.targetPort]
 * @see [setStyle]
 * @see [IEdge.style]
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-createEdge(IPort,IPort,IEdgeStyle,Object)">Online Documentation</a>
 */
   fun createEdge( sourcePort: IPort ,
 targetPort: IPort ,
 style: IEdgeStyle?  = definedExternally,
 tag: Tag?  = definedExternally):IEdge
/**
 * Creates and returns an edge that connects to the given node instances using the given style instance.
 * @param [source] The source node the created edge will connect to. It is up to the implementation to decide which port to use at the given node. An implementation may create a new port of the edge. To change the source port after the edge has been created, use [setEdgePorts].
 * @param [target] The target node the created edge will connect to. It is up to the implementation to decide which port to use at the given node. An implementation may create a new port of the edge. To change the target port after the edge has been created, use [setEdgePorts].
 * @param [style] The style instance that will be assigned to the newly created instance. This is done by reference. If omitted the [default style][edgeDefaults] will be set. To change the style after the edge has been created, use [setStyle].
 * @param [tag] The initial value of the [ITagOwner.tag] that will be assigned to the new edge.
 * @return the newly created edge instance
 * @see [addEdgeCreatedListener]
 * @see [VoidEdgeStyle.INSTANCE][yfiles.styles.VoidEdgeStyle.INSTANCE]
 * @see [edgeDefaults]
 * @see [setEdgePorts]
 * @see [IEdge.sourcePort]
 * @see [IEdge.targetPort]
 * @see [setStyle]
 * @see [IEdge.style]
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-createEdge(INode,INode,IEdgeStyle,Object)">Online Documentation</a>
 */
   fun createEdge( source: INode ,
 target: INode ,
 style: IEdgeStyle?  = definedExternally,
 tag: Tag?  = definedExternally):IEdge
/**
 * Creates a new group node using the provided style and layout as a child of `parent`.
 * @param [parent] The node to use as the [parent][getParent] in the grouping hierarchy or `null` if the new node should become a top-level node. To change the parent after the group node has been created, use [setParent].
 * @param [layout] The initial layout to use for the new node. If omitted the node will be placed with its top left corner at 0,0 and the [default size][groupNodeDefaults]. To change the layout after the group node has been created, use [setNodeLayout].
 * @param [style] The style to use for the new node. If omitted the [default style][groupNodeDefaults] will be set. To change the style after the group node has been created, use [setStyle].
 * @param [tag] The [ITagOwner.tag] to assign to the [INode].
 * @return The newly created group node.
 * @throws ArgumentError The `layout` contains one or more `NaN` values.
 * @see [createNode]
 * @see [setParent]
 * @see [getParent]
 * @see [setNodeLayout]
 * @see [INode.layout]
 * @see [setStyle]
 * @see [INode.style]
 * @see [ITagOwner.tag]
 * @see [groupNodeDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-createGroupNode">Online Documentation</a>
 */
   fun createGroupNode( parent: INode?  = definedExternally,
 layout: Rect?  = definedExternally,
 style: INodeStyle?  = definedExternally,
 tag: Tag?  = definedExternally):INode
/**
 * Creates and returns a node using the specified values for the initial geometry, style, and [ITagOwner.tag].
 * @param [layout] The layout to use initially. The values will be copied to the node's [Layout][INode.layout] field. To change the layout after the node has been created, use [setNodeLayout].
 * @param [style] The style instance that will be assigned to the newly created instance. This is done by reference. If omitted the [default style][nodeDefaults] will be set. To change the style after the node has been added, use [setStyle].
 * @param [tag] The initial value of the [ITagOwner.tag] that will be assigned to the new node.
 * @return A newly created node instance
 * @throws ArgumentError `layout` contains one or more `NaN` values.
 * @see [addNodeCreatedListener]
 * @see [VoidNodeStyle.INSTANCE][yfiles.styles.VoidNodeStyle.INSTANCE]
 * @see [nodeDefaults]
 * @see [setNodeLayout]
 * @see [INode.layout]
 * @see [setStyle]
 * @see [INode.style]
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-createNode(Rect,INodeStyle,Object)">Online Documentation</a>
 */
   fun createNode( layout: Rect ,
 style: INodeStyle?  = definedExternally,
 tag: Tag?  = definedExternally):INode
/**
 * Creates a new ordinary node as a direct descendant of `parent` using the given layout and style.
 * @param [parent] The node to use as the parent in the grouping hierarchy or `null` if the new node should become a top-level node. To change the parent after group node has been created, use [setParent].
 * @param [layout] The layout to use initially. The values will be copied to the node's [Layout][INode.layout] field. If omitted the [default size][nodeDefaults] will be set and the node's top left corner will be placed at 0,0. To change the layout after the group node has been created, use [setNodeLayout].
 * @param [style] The style instance that will be assigned to the newly created instance. This is done by reference. If omitted the [default style][nodeDefaults] will be set.
 * @param [tag] The [ITagOwner.tag] to assign to the [INode].
 * @return The newly created node.
 * @throws ArgumentError `parent` is not in this graph, or `layout` contains one or more `NaN` values.
 * @see [setParent]
 * @see [getParent]
 * @see [setNodeLayout]
 * @see [INode.layout]
 * @see [setStyle]
 * @see [INode.style]
 * @see [ITagOwner.tag]
 * @see [createNode]
 * @see [createGroupNode]
 * @see [nodeDefaults]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-createNode(INode,Rect,INodeStyle,Object)">Online Documentation</a>
 */
   fun createNode( parent: INode?  = definedExternally,
 layout: Rect?  = definedExternally,
 style: INodeStyle?  = definedExternally,
 tag: Tag?  = definedExternally):INode
/**
 * Creates and returns a node using the specified initial center location and style, as well as the tag.
 * @param [location] the initial coordinates of the center of the node's [Layout][INode.layout] property
 * @param [style] The style instance that will be assigned to the newly created instance. This is done by reference.
 * @param [tag] The initial value of the [ITagOwner.tag] that will be assigned to the new node.
 * @return A newly created node instance
 * @throws ArgumentError `location` contains one or more `NaN` values.
 * @see [addNodeCreatedListener]
 * @see [createNode]
 * @see [setNodeCenter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-createNodeAt">Online Documentation</a>
 */
  final  fun createNodeAt( location: Point ,
 style: INodeStyle?  = definedExternally,
 tag: Tag?  = definedExternally):INode = definedExternally
/**
 * Calculates the number of edges at the given [IPortOwner] for this graph.
 * @param [owner] The port owner to count the degree of.
 * @return The number of edges that are incident to the port owner.
 * @throws ArgumentError `owner` is not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-degree(IPortOwner)">Online Documentation</a>
 */
  final  fun degree( owner: IPortOwner ):Int = definedExternally
/**
 * Calculates the number of edges at the given [IPort] for this graph.
 * @param [port] The port owner to count the degree of.
 * @return The number of edges that are incident to the port.
 * @throws ArgumentError `port` is not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-degree(IPort)">Online Documentation</a>
 */
  final  fun degree( port: IPort ):Int = definedExternally
/**
 * Returns an [IEnumerable] for all edges that are adjacent to the given port as a [IEdge.sourcePort] or [IEdge.targetPort].
 * @param [port] the port to check
 * @param [type] The type of adjacency to consider.
 * @return An enumeration of all adjacent edges of the given type.
 * @throws ArgumentError `port` is not in this graph.
 * @see [inEdgesAt]
 * @see [outEdgesAt]
 * @see [AdjacencyTypes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-edgesAt(IPort,AdjacencyTypes)">Online Documentation</a>
 */
   fun edgesAt( port: IPort ,
 type: AdjacencyTypes  = definedExternally):IListEnumerable<IEdge>
/**
 * Returns an [IListEnumerable] for all edges that have the given port owner as their [target port's][IEdge.targetPort] or [source port's][IEdge.sourcePort] [IPort.owner] depending on the [AdjacencyTypes]
 * @param [owner] the port owner to check
 * @param [type] The type of adjacency to consider.
 * @return An enumeration of all adjacent edges of the given type.
 * @throws ArgumentError `owner` is not in this graph.
 * @see [inEdgesAt]
 * @see [outEdgesAt]
 * @see [AdjacencyTypes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-edgesAt(IPortOwner,AdjacencyTypes)">Online Documentation</a>
 */
   fun edgesAt( owner: IPortOwner ,
 type: AdjacencyTypes  = definedExternally):IListEnumerable<IEdge>
/**
 * Returns an enumerable over the children of the provided node.
 * @param [node] The node for which to return the children or `null` if the top-level nodes should be returned.
 * @return All nodes that have `node` as their [parent][getParent].
 * @throws ArgumentError `node` is not in this graph.
 * @see [GroupingSupport.getDescendants]
 * @see [setParent]
 * @see [getParent]
 * @see [createNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-getChildren">Online Documentation</a>
 */
   fun getChildren( node: INode? ):IListEnumerable<INode>
/**
 * Finds an edge that connects `from` and `to` in the given graph.
 * @param [from] The [IEdge.sourcePort] owner of the edge to find.
 * @param [to] The [IEdge.targetPort] owner of the edge to find.
 * @return An edge that satisfies the constraints or `null`, if none was found.
 * @throws ArgumentError `from` or `to` are not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-getEdge(IPortOwner,IPortOwner)">Online Documentation</a>
 */
  final  fun getEdge( from: IPortOwner ,
 to: IPortOwner ):IEdge? = definedExternally
/**
 * Finds an edge that connects `sourcePort` and `targetPort` in the given graph.
 * @param [sourcePort] The [IEdge.sourcePort] of the edge to find.
 * @param [targetPort] The [IEdge.targetPort] of the edge to find.
 * @return An edge that satisfies the constraints or `null`, if none was found.
 * @throws ArgumentError `sourcePort` or `targetPort` are not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-getEdge(IPort,IPort)">Online Documentation</a>
 */
  final  fun getEdge( sourcePort: IPort ,
 targetPort: IPort ):IEdge? = definedExternally
/**
 * Gets the [label defaults][ILabelDefaults] for a given [ILabelOwner] in the context of the `graph`.
 * @param [owner] The item that the label defaults are returned for. If this is a group node, the [groupNodeDefaults]'s [label defaults][INodeDefaults.labels] will be returned, otherwise the [nodeDefaults] or [edgeDefaults] [labels][INodeDefaults.labels] will be returned.
 * @return Appropriate [ILabelDefaults] for the provided `owner`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-getLabelDefaults">Online Documentation</a>
 */
  final  fun getLabelDefaults( owner: ILabelOwner ):ILabelDefaults = definedExternally
/**
 * Returns the parent node of the node or `null` if `node` is a top-level node.
 * @param [node] The node to retrieve the parent node for.
 * @return The parent node in this hierarchy or `null` if `node` is a top-level node.
 * @throws ArgumentError `node` is not in this graph.
 * @see [setParent]
 * @see [getChildren]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-getParent">Online Documentation</a>
 */
   fun getParent( node: INode ):INode?
/**
 * Gets the [port defaults][IPortDefaults] for a given [IPortOwner] in the context of the `graph`.
 * @param [owner] The item that the label defaults are returned for. If this is a group node, the [groupNodeDefaults]'s [port defaults][INodeDefaults.ports] will be returned, otherwise the [nodeDefaults] or [edgeDefaults] [ports][INodeDefaults.ports] will be returned.
 * @return Appropriate [IPortDefaults] for the provided `owner`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-getPortDefaults">Online Documentation</a>
 */
  final  fun getPortDefaults( owner: IPortOwner ):IPortDefaults = definedExternally
/**
 * Groups the nodes in `children` into a newly created group node.
 * @param [children] The children to group into the new group node.
 * @return The newly created group node.
 * @throws ArgumentError One of `children` is not in this graph.
 * @see [GroupingSupport.getNearestCommonAncestor]
 * @see [groupNodes]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-groupNodes(IEnumerable)">Online Documentation</a>
 */
  final  fun groupNodes( children: IEnumerable<INode> ):INode = definedExternally
/**
 * Groups the nodes in `children` into the provided group node.
 * @param [parent] The node to use as the parent in the grouping hierarchy.
 * @param [children] The children to group into the group node.
 * @throws ArgumentError `parent` or one of `children` is not in this graph.
 * @see [groupNodes]
 * @see [setParent]
 * @see [createGroupNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-groupNodes(INode,IEnumerable)">Online Documentation</a>
 */
  final  fun groupNodes( parent: INode ,
 children: IEnumerable<INode> ):Unit = definedExternally
/**
 * Calculates the number of incoming edges at the given [IPortOwner] for this graph.
 * @param [owner] The port owner to count the incoming edges of.
 * @return The number of edges that have the port owner as their target port's owner.
 * @throws ArgumentError `owner` is not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-inDegree(IPortOwner)">Online Documentation</a>
 */
  final  fun inDegree( owner: IPortOwner ):Int = definedExternally
/**
 * Calculates the number of incoming edges at the given [IPort] for this graph.
 * @param [port] The port to count the incoming edges of.
 * @return The number of edges that have the port as their target port.
 * @throws ArgumentError `port` is not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-inDegree(IPort)">Online Documentation</a>
 */
  final  fun inDegree( port: IPort ):Int = definedExternally
/**
 * Convenience method that yields the incoming edges at the given owner.
 * @param [owner] The owner of the edges.
 * @return An enumerable for the edges.
 * @throws ArgumentError `owner` is not in this graph.
 * @see [edgesAt]
 * @see [outEdgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-inEdgesAt(IPortOwner)">Online Documentation</a>
 */
  final  fun inEdgesAt( owner: IPortOwner ):IListEnumerable<IEdge> = definedExternally
/**
 * Convenience method that yields the incoming edges at the given port.
 * @param [port] The port of the edges.
 * @return An enumerable for the edges.
 * @throws ArgumentError `port` is not in this graph.
 * @see [edgesAt]
 * @see [outEdgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-inEdgesAt(IPort)">Online Documentation</a>
 */
  final  fun inEdgesAt( port: IPort ):IListEnumerable<IEdge> = definedExternally
/**
 * Causes the [DisplaysInvalidated] event to be triggered.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-invalidateDisplays">Online Documentation</a>
 */
   fun invalidateDisplays()
/**
 * Returns whether the given node is a group node.
 * @param [node] The node to check.
 * @return Whether the node is considered a group node.
 * @throws ArgumentError `node` is not in this graph.
 * @see [getChildren]
 * @see [setIsGroupNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-isGroupNode">Online Documentation</a>
 */
   fun isGroupNode( node: INode ):Boolean
/**
 * Enumerates the neighbors of a given [INode].
 * @param [node] The node.
 * @return An enumerable over all neighbors.
 * @throws ArgumentError `node` is not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-neighbors">Online Documentation</a>
 */
  final  fun neighbors( node: INode ):IEnumerable<INode> = definedExternally
/**
 * Calculates the number of outgoing edges at the given [IPortOwner] for this graph.
 * @param [owner] The port owner to count the outgoing edges of.
 * @return The number of edges that have the port owner as their source port's owner.
 * @throws ArgumentError `owner` is not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-outDegree(IPortOwner)">Online Documentation</a>
 */
  final  fun outDegree( owner: IPortOwner ):Int = definedExternally
/**
 * Calculates the number of outgoing edges at the given [IPort] for this graph.
 * @param [port] The port to count the outgoing edges of.
 * @return The number of edges that have the port as their source port.
 * @throws ArgumentError `port` is not in this graph.
 * @see [edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-outDegree(IPort)">Online Documentation</a>
 */
  final  fun outDegree( port: IPort ):Int = definedExternally
/**
 * Convenience method that yields the outgoing edges at the given owner.
 * @param [owner] The owner of the edges.
 * @return An enumerable for the edges.
 * @throws ArgumentError `owner` is not in this graph.
 * @see [edgesAt]
 * @see [inEdgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-outEdgesAt(IPortOwner)">Online Documentation</a>
 */
  final  fun outEdgesAt( owner: IPortOwner ):IListEnumerable<IEdge> = definedExternally
/**
 * Convenience method that yields the outgoing edges at the given port.
 * @param [port] The owner of the edges.
 * @return An enumerable for the edges.
 * @throws ArgumentError `port` is not in this graph.
 * @see [edgesAt]
 * @see [inEdgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-outEdgesAt(IPort)">Online Documentation</a>
 */
  final  fun outEdgesAt( port: IPort ):IListEnumerable<IEdge> = definedExternally
/**
 * Enumerates the predecessors of a given [INode].
 * @param [node] The node.
 * @return An enumerable over all predecessors.
 * @throws ArgumentError `node` is not in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-predecessors">Online Documentation</a>
 */
  final  fun predecessors( node: INode ):IEnumerable<INode> = definedExternally
/**
 * Removes the given [item][IModelItem] from this graph.
 * @param [item] the item to be removed from this graph instance
 * @throws ArgumentError `item` is not in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-remove">Online Documentation</a>
 */
   fun remove( item: IModelItem )

/**
 * Removes the given [item][IModelItem] from this graph.
 * @param [item] the item to be removed from this graph instance
 * @throws ArgumentError `item` is not in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-remove">Online Documentation</a>
 */
@JsName("remove")
  final operator fun minusAssign( item: IModelItem ):Unit = definedExternally
/**
 * Reverses an edge by [setting source and target port][setEdgePorts] to [IEdge.targetPort] and [IEdge.sourcePort].
 * @param [edge] The edge to reverse.
 * @throws ArgumentError `edge` is not in this graph.
 * @see [setEdgePorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-reverse">Online Documentation</a>
 */
  final  fun reverse( edge: IEdge ):Unit = definedExternally
/**
 * Modifies the location of the given bend.
 * @param [bend] the bend whose location is to be modified
 * @param [location] the new location of the bend
 * @throws ArgumentError `bend` is not in this graph, or `location` contains one or more `NaN` values.
 * @see [addBend]
 * @see [IBend.location]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setBendLocation">Online Documentation</a>
 */
   fun setBendLocation( bend: IBend ,
 location: Point )
/**
 * Sets the source and target ports of the given edge to the new values.
 * @param [edge] The edge to change the ports.
 * @param [sourcePort] The new source port instance.
 * @param [targetPort] The new target port instance.
 * @throws ArgumentError Either `edge`, `sourcePort`, or `targetPort` are not in this graph.
 * @see [IEdge.sourcePort]
 * @see [IEdge.targetPort]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setEdgePorts">Online Documentation</a>
 */
   fun setEdgePorts( edge: IEdge ,
 sourcePort: IPort ,
 targetPort: IPort )
/**
 * Changes whether the given node is a group node or not.
 * @param [node] The node to set the group node status for.
 * @param [isGroupNode] Whether to make the node a group node.
 * @throws ArgumentError `node` is not in this graph.
 * @throws InvalidOperationError `node` is `null` or currently has children and `isGroupNode` is `false`.
 * @see [getChildren]
 * @see [isGroupNode]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setIsGroupNode">Online Documentation</a>
 */
   fun setIsGroupNode( node: INode ,
 isGroupNode: Boolean )
/**
 * Sets the label model parameter for the given label.
 * @param [label] The label.
 * @param [layoutParameter] The new parameter.
 * @throws ArgumentError `label` is not in this graph, or `layoutParameter` cannot be used for `label`.
 * @see [ILabel.layoutParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setLabelLayoutParameter">Online Documentation</a>
 */
   fun setLabelLayoutParameter( label: ILabel ,
 layoutParameter: ILabelModelParameter )
/**
 * Sets the preferred size of the label.
 * @param [label] The label.
 * @param [preferredSize] The new preferred size.
 * @throws ArgumentError `label` is not in this graph or `preferredSize` contains one or more `NaN` values.
 * @see [ILabel.preferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setLabelPreferredSize">Online Documentation</a>
 */
   fun setLabelPreferredSize( label: ILabel ,
 preferredSize: Size )
/**
 * Sets the label text of the given label.
 * @param [label] the label to modify
 * @param [text] the new text of the label
 * @throws ArgumentError `label` is not in this graph.
 * @see [ILabel.text]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setLabelText">Online Documentation</a>
 */
   fun setLabelText( label: ILabel ,
 text: String )
/**
 * Sets the center of a node to the given world coordinates.
 * @param [node] The node to recenter.
 * @param [center] The new center coordinates of the node in the world coordinate system.
 * @throws ArgumentError `center` contains one or more `NaN` values.
 * @see [setNodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-setNodeCenter">Online Documentation</a>
 */
  final  fun setNodeCenter( node: INode ,
 center: Point ):Unit = definedExternally
/**
 * Sets the layout of the given node to the new value.
 * @param [node] a live node that belongs to this graph
 * @param [layout] The new layout of the node to assign to its [INode.layout].
 * @throws ArgumentError `node` is not in this graph, or `layout` contains one or more `NaN` values.
 * @see [INode.layout]
 * @see [setNodeCenter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setNodeLayout">Online Documentation</a>
 */
   fun setNodeLayout( node: INode ,
 layout: Rect )
/**
 * Sets the parent node for a given node.
 * @param [node] The node to assign a new parent.
 * @param [parent] The parent group node to assign to `node` or `null` to make `node` a top-level node.
 * @throws ArgumentError Either `node` or `parent` are not in this graph.
 * @see [getParent]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setParent">Online Documentation</a>
 */
   fun setParent( node: INode ,
 parent: INode? )
/**
 * Convenience method that tries to set the absolute coordinates of the given port to the given values.
 * @param [port] The port to modify
 * @param [location] the new absolute coordinates of the port
 * @throws ArgumentError `port` is not in this graph.
 * @throws ArgumentError `location` contains one or more `NaN` values.
 * @see [addPort]
 * @see [setPortLocationParameter]
 * @see [setRelativePortLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-setPortLocation">Online Documentation</a>
 */
  final  fun setPortLocation( port: IPort ,
 location: Point ):Unit = definedExternally
/**
 * Sets a new [IPortLocationModelParameter] for the given port.
 * @param [port] The port to modify
 * @param [locationParameter] the new parameter that determines the coordinates of the port
 * @throws ArgumentError `port` is not in this graph, or `locationParameter` cannot be used for `port`.
 * @see [IPort.locationParameter]
 * @see [setPortLocation]
 * @see [setRelativePortLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setPortLocationParameter">Online Documentation</a>
 */
   fun setPortLocationParameter( port: IPort ,
 locationParameter: IPortLocationModelParameter )
/**
 * Tries to set the location of the port relative to its [owner][IPort.owner] if the owner is a [node][INode].
 * @param [port] the port
 * @param [relativeLocation] the new coordinate offsets relative to the center of the node's [INode.layout]'s center.
 * @throws ArgumentError `port` is not in this graph or has no owner.
 * @throws ArgumentError `relativeLocation` contains one or more `NaN` values.
 * @see [INode.layout]
 * @see [setRelativePortLocation]
 * @see [setPortLocationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-setRelativePortLocation">Online Documentation</a>
 */
  final  fun setRelativePortLocation( port: IPort ,
 relativeLocation: Point ):Unit = definedExternally
/**
 * Assigns the given style instance by reference to the node.
 * @param [node] The node that will be assigned the new style
 * @param [style] The style instance that will be assigned to the node.
 * @throws ArgumentError `node` is not in this graph.
 * @see [INode.style]
 * @see [addNodeStyleChangedListener]
 * @see [VoidNodeStyle.INSTANCE][yfiles.styles.VoidNodeStyle.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setStyle(INode,INodeStyle)">Online Documentation</a>
 */
   fun setStyle( node: INode ,
 style: INodeStyle )
/**
 * Assigns the given style instance by reference to the label.
 * @param [label] The label that will be assigned the new style
 * @param [style] The style instance that will be assigned to the label.
 * @throws ArgumentError `label` is not in this graph.
 * @see [ILabel.style]
 * @see [addLabelStyleChangedListener]
 * @see [VoidLabelStyle.INSTANCE][yfiles.styles.VoidLabelStyle.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setStyle(ILabel,ILabelStyle)">Online Documentation</a>
 */
   fun setStyle( label: ILabel ,
 style: ILabelStyle )
/**
 * Assigns the given style instance by reference to the edge.
 * @param [edge] The edge that will be assigned the new style
 * @param [style] The style instance that will be assigned to the edge.
 * @throws ArgumentError `edge` is not in this graph.
 * @see [IEdge.style]
 * @see [addEdgeStyleChangedListener]
 * @see [VoidEdgeStyle.INSTANCE][yfiles.styles.VoidEdgeStyle.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setStyle(IEdge,IEdgeStyle)">Online Documentation</a>
 */
   fun setStyle( edge: IEdge ,
 style: IEdgeStyle )
/**
 * Assigns the given style instance by reference to the port.
 * @param [port] The port that will be assigned the new style
 * @param [style] The style instance that will be assigned to the port.
 * @throws ArgumentError `port` is not in this graph.
 * @see [IPort.style]
 * @see [addPortStyleChangedListener]
 * @see [VoidPortStyle.INSTANCE][yfiles.styles.VoidPortStyle.INSTANCE]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-method-setStyle(IPort,IPortStyle)">Online Documentation</a>
 */
   fun setStyle( port: IPort ,
 style: IPortStyle )
/**
 * Enumerates the successors of a given [INode].
 * @param [node] The node.
 * @return An enumerable over all successors.
 * @throws ArgumentError `node` is not in this graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IGraph-defaultmethod-successors">Online Documentation</a>
 */
  final  fun successors( node: INode ):IEnumerable<INode> = definedExternally
/**
 * Occurs when the [tag][ITagOwner.tag] of the graph has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23GraphTagChanged">Online Documentation</a>
 */
fun addGraphTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IGraph, Tag>>)
fun removeGraphTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IGraph, Tag>>)

/**
 * Occurs when a node has been created.
 * @see [createNode]
 * @see [createGroupNode]
 * @see [GraphEditorInputMode.addNodeCreatedListener][yfiles.input.GraphEditorInputMode.addNodeCreatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeCreated">Online Documentation</a>
 */
fun addNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)
fun removeNodeCreatedListener(listener: EventHandler1<ItemEventArgs<INode>>)

/**
 * Occurs when the graph has changed visually and the display should be updated to reflect the changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23DisplaysInvalidated">Online Documentation</a>
 */
fun addDisplaysInvalidatedListener(listener: EventHandler1<EventArgs>)
fun removeDisplaysInvalidatedListener(listener: EventHandler1<EventArgs>)

/**
 * Occurs when a node has been removed.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeRemoved">Online Documentation</a>
 */
fun addNodeRemovedListener(listener: EventHandler1<NodeEventArgs>)
fun removeNodeRemovedListener(listener: EventHandler1<NodeEventArgs>)

/**
 * Occurs when a node style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeStyleChanged">Online Documentation</a>
 */
fun addNodeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>>)
fun removeNodeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>>)

/**
 * Occurs when a node layout has been changed.
 * @see [setNodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeLayoutChanged">Online Documentation</a>
 */
fun addNodeLayoutChangedListener(listener: NodeLayoutChangedHandler)
fun removeNodeLayoutChangedListener(listener: NodeLayoutChangedHandler)

/**
 * Occurs when the [tag][ITagOwner.tag] of a node has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeTagChanged">Online Documentation</a>
 */
fun addNodeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, Tag>>)
fun removeNodeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<INode, Tag>>)

/**
 * Occurs when an edge has been created.
 * @see [createEdge]
 * @see [CreateEdgeInputMode.addEdgeCreatedListener][yfiles.input.CreateEdgeInputMode.addEdgeCreatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeCreated">Online Documentation</a>
 */
fun addEdgeCreatedListener(listener: EventHandler1<ItemEventArgs<IEdge>>)
fun removeEdgeCreatedListener(listener: EventHandler1<ItemEventArgs<IEdge>>)

/**
 * Occurs when an edge has been removed.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeRemoved">Online Documentation</a>
 */
fun addEdgeRemovedListener(listener: EventHandler1<EdgeEventArgs>)
fun removeEdgeRemovedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * Occurs when an edge style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeStyleChanged">Online Documentation</a>
 */
fun addEdgeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>>)
fun removeEdgeStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>>)

/**
 * Occurs when an edge had its [IEdge.sourcePort] or [IEdge.targetPort] [changed][setEdgePorts].
 * @see [setEdgePorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgePortsChanged">Online Documentation</a>
 */
fun addEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)
fun removeEdgePortsChangedListener(listener: EventHandler1<EdgeEventArgs>)

/**
 * Occurs when the [tag][ITagOwner.tag] of an edge has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeTagChanged">Online Documentation</a>
 */
fun addEdgeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, Tag>>)
fun removeEdgeTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IEdge, Tag>>)

/**
 * Occurs when a bend has been added to an edge in this graph.
 * @see [addBend]
 * @see [CreateBendInputMode.addBendCreatedListener][yfiles.input.CreateBendInputMode.addBendCreatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendAdded">Online Documentation</a>
 */
fun addBendAddedListener(listener: EventHandler1<ItemEventArgs<IBend>>)
fun removeBendAddedListener(listener: EventHandler1<ItemEventArgs<IBend>>)

/**
 * Occurs when a bend has been removed from an edge in this graph.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendRemoved">Online Documentation</a>
 */
fun addBendRemovedListener(listener: EventHandler1<BendEventArgs>)
fun removeBendRemovedListener(listener: EventHandler1<BendEventArgs>)

/**
 * Occurs when the location of a bend has been changed.
 * @see [setBendLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendLocationChanged">Online Documentation</a>
 */
fun addBendLocationChangedListener(listener: BendLocationChangedHandler)
fun removeBendLocationChangedListener(listener: BendLocationChangedHandler)

/**
 * Occurs when the [tag][ITagOwner.tag] of a bend has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendTagChanged">Online Documentation</a>
 */
fun addBendTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IBend, Tag>>)
fun removeBendTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IBend, Tag>>)

/**
 * Occurs when a label has been added to this graph instance.
 * @see [addLabel]
 * @see [GraphEditorInputMode.addLabelAddedListener][yfiles.input.GraphEditorInputMode.addLabelAddedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelAdded">Online Documentation</a>
 */
fun addLabelAddedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)
fun removeLabelAddedListener(listener: EventHandler1<ItemEventArgs<ILabel>>)

/**
 * Occurs when a label has been removed from this graph instance.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see [GraphEditorInputMode.addLabelTextChangedListener][yfiles.input.GraphEditorInputMode.addLabelTextChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelRemoved">Online Documentation</a>
 */
fun addLabelRemovedListener(listener: EventHandler1<LabelEventArgs>)
fun removeLabelRemovedListener(listener: EventHandler1<LabelEventArgs>)

/**
 * Occurs when a label style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelStyleChanged">Online Documentation</a>
 */
fun addLabelStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>>)
fun removeLabelStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>>)

/**
 * Occurs when the preferred size of a label has been changed.
 * @see [setLabelPreferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelPreferredSizeChanged">Online Documentation</a>
 */
fun addLabelPreferredSizeChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>>)
fun removeLabelPreferredSizeChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>>)

/**
 * Occurs when the text of a label has been changed.
 * @see [setLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelTextChanged">Online Documentation</a>
 */
fun addLabelTextChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, String>>)
fun removeLabelTextChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, String>>)

/**
 * Occurs when the model parameter of a label has been changed.
 * @see [setLabelLayoutParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelLayoutParameterChanged">Online Documentation</a>
 */
fun addLabelLayoutParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>>)
fun removeLabelLayoutParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>>)

/**
 * Occurs when the [tag][ITagOwner.tag] of a label has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelTagChanged">Online Documentation</a>
 */
fun addLabelTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Tag>>)
fun removeLabelTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<ILabel, Tag>>)

/**
 * Occurs when a port has been added to this graph instance.
 * @see [addPort]
 * @see [createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortAdded">Online Documentation</a>
 */
fun addPortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)
fun removePortAddedListener(listener: EventHandler1<ItemEventArgs<IPort>>)

/**
 * Occurs when a port has been removed from its [owner][IPort.owner].
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortRemoved">Online Documentation</a>
 */
fun addPortRemovedListener(listener: EventHandler1<PortEventArgs>)
fun removePortRemovedListener(listener: EventHandler1<PortEventArgs>)

/**
 * Occurs when a port style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortStyleChanged">Online Documentation</a>
 */
fun addPortStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>>)
fun removePortStyleChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>>)

/**
 * Occurs when the location model parameter of a port has been changed.
 * @see [setPortLocationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortLocationParameterChanged">Online Documentation</a>
 */
fun addPortLocationParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>>)
fun removePortLocationParameterChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>>)

/**
 * Occurs when the [tag][ITagOwner.tag] of a port has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortTagChanged">Online Documentation</a>
 */
fun addPortTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, Tag>>)
fun removePortTagChangedListener(listener: EventHandler1<ItemChangedEventArgs<IPort, Tag>>)

/**
 * Occurs if a node has been reparented in the model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23ParentChanged">Online Documentation</a>
 */
fun addParentChangedListener(listener: EventHandler1<NodeEventArgs>)
fun removeParentChangedListener(listener: EventHandler1<NodeEventArgs>)

/**
 * Occurs if the group node status of a node has changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IsGroupNodeChanged">Online Documentation</a>
 */
fun addIsGroupNodeChangedListener(listener: EventHandler1<NodeEventArgs>)
fun removeIsGroupNodeChangedListener(listener: EventHandler1<NodeEventArgs>)

companion object : InterfaceMetadata<IGraph> {
}
}

/**
 * Occurs when the [tag][ITagOwner.tag] of the graph has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23GraphTagChanged">Online Documentation</a>
 */
inline fun  IGraph.addGraphTagChangedHandler(
    crossinline handler: (item:IGraph, oldValue:  Tag?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<IGraph, Tag>> = { _, event -> handler(event.item, event.oldValue) }
    addGraphTagChangedListener(listener)
    return { removeGraphTagChangedListener(listener) }
}
/**
 * Occurs when a node has been created.
 * @see [createNode]
 * @see [createGroupNode]
 * @see [GraphEditorInputMode.addNodeCreatedListener][yfiles.input.GraphEditorInputMode.addNodeCreatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeCreated">Online Documentation</a>
 */
inline fun  IGraph.addNodeCreatedHandler(
    crossinline handler: (item:INode) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<INode>> = { _, event -> handler(event.item) }
    addNodeCreatedListener(listener)
    return { removeNodeCreatedListener(listener) }
}
/**
 * Occurs when the graph has changed visually and the display should be updated to reflect the changes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23DisplaysInvalidated">Online Documentation</a>
 */
inline fun  IGraph.addDisplaysInvalidatedHandler(
    crossinline handler: () -> Unit
): () -> Unit {
    val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
    addDisplaysInvalidatedListener(listener)
    return { removeDisplaysInvalidatedListener(listener) }
}
/**
 * Occurs when a node has been removed.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeRemoved">Online Documentation</a>
 */
inline fun  IGraph.addNodeRemovedHandler(
    crossinline handler: (event:NodeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<NodeEventArgs> = { _, event -> handler(event) }
    addNodeRemovedListener(listener)
    return { removeNodeRemovedListener(listener) }
}
/**
 * Occurs when a node style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeStyleChanged">Online Documentation</a>
 */
inline fun  IGraph.addNodeStyleChangedHandler(
    crossinline handler: (item:INode, oldValue:  INodeStyle?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>> = { _, event -> handler(event.item, event.oldValue) }
    addNodeStyleChangedListener(listener)
    return { removeNodeStyleChangedListener(listener) }
}
/**
 * Occurs when a node layout has been changed.
 * @see [setNodeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeLayoutChanged">Online Documentation</a>
 */
inline fun  IGraph.addNodeLayoutChangedHandler(
    crossinline handler: (node: INode, oldLayout: Rect) -> Unit
): () -> Unit {
    val listener: NodeLayoutChangedHandler = { _, node, oldLayout -> handler(node, oldLayout) }
    addNodeLayoutChangedListener(listener)
    return { removeNodeLayoutChangedListener(listener) }
}
/**
 * Occurs when the [tag][ITagOwner.tag] of a node has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23NodeTagChanged">Online Documentation</a>
 */
inline fun  IGraph.addNodeTagChangedHandler(
    crossinline handler: (item:INode, oldValue:  Tag?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<INode, Tag>> = { _, event -> handler(event.item, event.oldValue) }
    addNodeTagChangedListener(listener)
    return { removeNodeTagChangedListener(listener) }
}
/**
 * Occurs when an edge has been created.
 * @see [createEdge]
 * @see [CreateEdgeInputMode.addEdgeCreatedListener][yfiles.input.CreateEdgeInputMode.addEdgeCreatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeCreated">Online Documentation</a>
 */
inline fun  IGraph.addEdgeCreatedHandler(
    crossinline handler: (item:IEdge) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IEdge>> = { _, event -> handler(event.item) }
    addEdgeCreatedListener(listener)
    return { removeEdgeCreatedListener(listener) }
}
/**
 * Occurs when an edge has been removed.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeRemoved">Online Documentation</a>
 */
inline fun  IGraph.addEdgeRemovedHandler(
    crossinline handler: (event:EdgeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<EdgeEventArgs> = { _, event -> handler(event) }
    addEdgeRemovedListener(listener)
    return { removeEdgeRemovedListener(listener) }
}
/**
 * Occurs when an edge style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeStyleChanged">Online Documentation</a>
 */
inline fun  IGraph.addEdgeStyleChangedHandler(
    crossinline handler: (item:IEdge, oldValue:  IEdgeStyle?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>> = { _, event -> handler(event.item, event.oldValue) }
    addEdgeStyleChangedListener(listener)
    return { removeEdgeStyleChangedListener(listener) }
}
/**
 * Occurs when an edge had its [IEdge.sourcePort] or [IEdge.targetPort] [changed][setEdgePorts].
 * @see [setEdgePorts]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgePortsChanged">Online Documentation</a>
 */
inline fun  IGraph.addEdgePortsChangedHandler(
    crossinline handler: (event:EdgeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<EdgeEventArgs> = { _, event -> handler(event) }
    addEdgePortsChangedListener(listener)
    return { removeEdgePortsChangedListener(listener) }
}
/**
 * Occurs when the [tag][ITagOwner.tag] of an edge has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23EdgeTagChanged">Online Documentation</a>
 */
inline fun  IGraph.addEdgeTagChangedHandler(
    crossinline handler: (item:IEdge, oldValue:  Tag?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<IEdge, Tag>> = { _, event -> handler(event.item, event.oldValue) }
    addEdgeTagChangedListener(listener)
    return { removeEdgeTagChangedListener(listener) }
}
/**
 * Occurs when a bend has been added to an edge in this graph.
 * @see [addBend]
 * @see [CreateBendInputMode.addBendCreatedListener][yfiles.input.CreateBendInputMode.addBendCreatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendAdded">Online Documentation</a>
 */
inline fun  IGraph.addBendAddedHandler(
    crossinline handler: (item:IBend) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IBend>> = { _, event -> handler(event.item) }
    addBendAddedListener(listener)
    return { removeBendAddedListener(listener) }
}
/**
 * Occurs when a bend has been removed from an edge in this graph.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendRemoved">Online Documentation</a>
 */
inline fun  IGraph.addBendRemovedHandler(
    crossinline handler: (event:BendEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<BendEventArgs> = { _, event -> handler(event) }
    addBendRemovedListener(listener)
    return { removeBendRemovedListener(listener) }
}
/**
 * Occurs when the location of a bend has been changed.
 * @see [setBendLocation]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendLocationChanged">Online Documentation</a>
 */
inline fun  IGraph.addBendLocationChangedHandler(
    crossinline handler: (bend: IBend, oldLocation: Point) -> Unit
): () -> Unit {
    val listener: BendLocationChangedHandler = { _, bend, oldLocation -> handler(bend, oldLocation) }
    addBendLocationChangedListener(listener)
    return { removeBendLocationChangedListener(listener) }
}
/**
 * Occurs when the [tag][ITagOwner.tag] of a bend has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23BendTagChanged">Online Documentation</a>
 */
inline fun  IGraph.addBendTagChangedHandler(
    crossinline handler: (item:IBend, oldValue:  Tag?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<IBend, Tag>> = { _, event -> handler(event.item, event.oldValue) }
    addBendTagChangedListener(listener)
    return { removeBendTagChangedListener(listener) }
}
/**
 * Occurs when a label has been added to this graph instance.
 * @see [addLabel]
 * @see [GraphEditorInputMode.addLabelAddedListener][yfiles.input.GraphEditorInputMode.addLabelAddedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelAdded">Online Documentation</a>
 */
inline fun  IGraph.addLabelAddedHandler(
    crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<ILabel>> = { _, event -> handler(event.item) }
    addLabelAddedListener(listener)
    return { removeLabelAddedListener(listener) }
}
/**
 * Occurs when a label has been removed from this graph instance.
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see [GraphEditorInputMode.addLabelTextChangedListener][yfiles.input.GraphEditorInputMode.addLabelTextChangedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelRemoved">Online Documentation</a>
 */
inline fun  IGraph.addLabelRemovedHandler(
    crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<LabelEventArgs> = { _, event -> handler(event) }
    addLabelRemovedListener(listener)
    return { removeLabelRemovedListener(listener) }
}
/**
 * Occurs when a label style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelStyleChanged">Online Documentation</a>
 */
inline fun  IGraph.addLabelStyleChangedHandler(
    crossinline handler: (item:ILabel, oldValue:  ILabelStyle?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>> = { _, event -> handler(event.item, event.oldValue) }
    addLabelStyleChangedListener(listener)
    return { removeLabelStyleChangedListener(listener) }
}
/**
 * Occurs when the preferred size of a label has been changed.
 * @see [setLabelPreferredSize]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelPreferredSizeChanged">Online Documentation</a>
 */
inline fun  IGraph.addLabelPreferredSizeChangedHandler(
    crossinline handler: (item:ILabel, oldValue:  Size?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>> = { _, event -> handler(event.item, event.oldValue) }
    addLabelPreferredSizeChangedListener(listener)
    return { removeLabelPreferredSizeChangedListener(listener) }
}
/**
 * Occurs when the text of a label has been changed.
 * @see [setLabelText]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelTextChanged">Online Documentation</a>
 */
inline fun  IGraph.addLabelTextChangedHandler(
    crossinline handler: (item:ILabel, oldValue:  String?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<ILabel, String>> = { _, event -> handler(event.item, event.oldValue) }
    addLabelTextChangedListener(listener)
    return { removeLabelTextChangedListener(listener) }
}
/**
 * Occurs when the model parameter of a label has been changed.
 * @see [setLabelLayoutParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelLayoutParameterChanged">Online Documentation</a>
 */
inline fun  IGraph.addLabelLayoutParameterChangedHandler(
    crossinline handler: (item:ILabel, oldValue:  ILabelModelParameter?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>> = { _, event -> handler(event.item, event.oldValue) }
    addLabelLayoutParameterChangedListener(listener)
    return { removeLabelLayoutParameterChangedListener(listener) }
}
/**
 * Occurs when the [tag][ITagOwner.tag] of a label has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23LabelTagChanged">Online Documentation</a>
 */
inline fun  IGraph.addLabelTagChangedHandler(
    crossinline handler: (item:ILabel, oldValue:  Tag?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<ILabel, Tag>> = { _, event -> handler(event.item, event.oldValue) }
    addLabelTagChangedListener(listener)
    return { removeLabelTagChangedListener(listener) }
}
/**
 * Occurs when a port has been added to this graph instance.
 * @see [addPort]
 * @see [createEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortAdded">Online Documentation</a>
 */
inline fun  IGraph.addPortAddedHandler(
    crossinline handler: (item:IPort) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemEventArgs<IPort>> = { _, event -> handler(event.item) }
    addPortAddedListener(listener)
    return { removePortAddedListener(listener) }
}
/**
 * Occurs when a port has been removed from its [owner][IPort.owner].
 * @see [remove]
 * @see [GraphEditorInputMode.addDeletedItemListener][yfiles.input.GraphEditorInputMode.addDeletedItemListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortRemoved">Online Documentation</a>
 */
inline fun  IGraph.addPortRemovedHandler(
    crossinline handler: (event:PortEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<PortEventArgs> = { _, event -> handler(event) }
    addPortRemovedListener(listener)
    return { removePortRemovedListener(listener) }
}
/**
 * Occurs when a port style has been replaced.
 * @see [setStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortStyleChanged">Online Documentation</a>
 */
inline fun  IGraph.addPortStyleChangedHandler(
    crossinline handler: (item:IPort, oldValue:  IPortStyle?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>> = { _, event -> handler(event.item, event.oldValue) }
    addPortStyleChangedListener(listener)
    return { removePortStyleChangedListener(listener) }
}
/**
 * Occurs when the location model parameter of a port has been changed.
 * @see [setPortLocationParameter]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortLocationParameterChanged">Online Documentation</a>
 */
inline fun  IGraph.addPortLocationParameterChangedHandler(
    crossinline handler: (item:IPort, oldValue:  IPortLocationModelParameter?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>> = { _, event -> handler(event.item, event.oldValue) }
    addPortLocationParameterChangedListener(listener)
    return { removePortLocationParameterChangedListener(listener) }
}
/**
 * Occurs when the [tag][ITagOwner.tag] of a port has been replaced.
 * @see [ITagOwner.tag]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23PortTagChanged">Online Documentation</a>
 */
inline fun  IGraph.addPortTagChangedHandler(
    crossinline handler: (item:IPort, oldValue:  Tag?) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemChangedEventArgs<IPort, Tag>> = { _, event -> handler(event.item, event.oldValue) }
    addPortTagChangedListener(listener)
    return { removePortTagChangedListener(listener) }
}
/**
 * Occurs if a node has been reparented in the model.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23ParentChanged">Online Documentation</a>
 */
inline fun  IGraph.addParentChangedHandler(
    crossinline handler: (event:NodeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<NodeEventArgs> = { _, event -> handler(event) }
    addParentChangedListener(listener)
    return { removeParentChangedListener(listener) }
}
/**
 * Occurs if the group node status of a node has changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IGraph%23IsGroupNodeChanged">Online Documentation</a>
 */
inline fun  IGraph.addIsGroupNodeChangedHandler(
    crossinline handler: (event:NodeEventArgs) -> Unit
): () -> Unit {
    val listener: EventHandler1<NodeEventArgs> = { _, event -> handler(event) }
    addIsGroupNodeChangedListener(listener)
    return { removeIsGroupNodeChangedListener(listener) }
}
