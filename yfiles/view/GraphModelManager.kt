// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IComparer
import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.input.IHitTester
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.Func2
import yfiles.lang.YClass
import yfiles.lang.YObject

/**
 * Manages the visual appearance of an [IGraph] instance in a [CanvasComponent].
 * @see [nodeGroup]
 * @see [HierarchicNestingPolicy]
 * @see [LabelLayerPolicy]
 * @see [PortLayerPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new manager instance.
 * @param [canvas] the canvas to manage the visual appearance of a graph for. Optional parameter that does not need to be provided when this instance will be [installed, later][install].
 * @param [contentGroup] the group to add the graph's visual content to. If omitted [contentGroup] should be set afterwards or [createContentGroup] will automatically create a group lazily.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-constructor-GraphModelManager">Online Documentation</a>
 */
external open class GraphModelManager  ( canvas: CanvasComponent?  = definedExternally,
 contentGroup: ICanvasObjectGroup?  = definedExternally) : YObject {

/**
 * Gets the currently installed in [CanvasComponent].
 * @see [install]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23canvasComponent">Online Documentation</a>
 */
protected final val canvasComponent: CanvasComponent?
/**
 * Gets an [IComparer] instance that can be used to compare two model items with respect to their visual display order.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23comparer">Online Documentation</a>
 */
final val comparer: IComparer<IModelItem>
/**
 * Gets or sets the content group this manager instance uses to add visual representation of the graph to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23contentGroup">Online Documentation</a>
 */
final var contentGroup: ICanvasObjectGroup
/**
 * Gets or sets the [ICanvasObjectDescriptor] instance used for installing an [IEdge] into the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeDescriptor">Online Documentation</a>
 */
final var edgeDescriptor: ICanvasObjectDescriptor<IEdge>
/**
 * Gets the [ICanvasObjectGroup] instance that will be used for installing edge styles.
 * @see [getEdgeCanvasObjectGroup]
 * @see [edgeDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeGroup">Online Documentation</a>
 */
final val edgeGroup: ICanvasObjectGroup
/**
 * Gets or sets the [ICanvasObjectDescriptor] instance used for installing an [ILabel] of an [IEdge] into the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelDescriptor">Online Documentation</a>
 */
final var edgeLabelDescriptor: ICanvasObjectDescriptor<ILabel>
/**
 * Gets the [ICanvasObjectGroup] instance that will be used for installing edge label styles.
 * @see [getLabelCanvasObjectGroup]
 * @see [edgeLabelDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelGroup">Online Documentation</a>
 */
final val edgeLabelGroup: ICanvasObjectGroup
/**
 * Gets or sets the policy to determines at which visual layer edge labels shall be inserted.
 * 
 * The default value is [LabelLayerPolicy.SEPARATE_LAYER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelLayerPolicy">Online Documentation</a>
 */
final var edgeLabelLayerPolicy: LabelLayerPolicy
/**
 * Provides access to the [ItemModelManager] which handles the [ILabel]s at edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelManager">Online Documentation</a>
 */
final val edgeLabelManager: ItemModelManager<ILabel>
/**
 * Provides access to the [ItemModelManager] which handles the [IEdge]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeManager">Online Documentation</a>
 */
final val edgeManager: ItemModelManager<IEdge>
/**
 * Gets or sets the graph this manager manages.
 * @see [onGraphChanged]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23graph">Online Documentation</a>
 */
final var graph: IGraph?
/**
 * Gets the [ICanvasObjectGroup] instance that will be used for installing node styles of [group nodes][IGraph.isGroupNode].
 * @see [getNodeCanvasObjectGroup]
 * @see [nodeDescriptor]
 * @see [hierarchicNestingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23groupNodeGroup">Online Documentation</a>
 */
final val groupNodeGroup: ICanvasObjectGroup
/**
 * Gets or sets the policy whether and how this instance should nest the nodes and edges if the graph is grouped.
 * 
 * The default is [HierarchicNestingPolicy.NODES_AND_EDGES].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23hierarchicNestingPolicy">Online Documentation</a>
 */
final var hierarchicNestingPolicy: HierarchicNestingPolicy
/**
 * Gets a [IHitTester] that can be used to enumerate hits on the canvas at a given world coordinate position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23hitTester">Online Documentation</a>
 */
final val hitTester: IHitTester<IModelItem>
/**
 * Gets or sets the policy to determines at which visual layer node, edge and port labels shall be inserted.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23labelLayerPolicy">Online Documentation</a>
 */
@Deprecated("Read documentation for more information")
final var labelLayerPolicy: LabelLayerPolicy
/**
 * Gets or sets the [ICanvasObjectDescriptor] instance used for installing an [INode] into the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeDescriptor">Online Documentation</a>
 */
final var nodeDescriptor: ICanvasObjectDescriptor<INode>
/**
 * Gets the [ICanvasObjectGroup] instance that will be used for installing node styles.
 * @see [getNodeCanvasObjectGroup]
 * @see [getMainCanvasObject]
 * @see [nodeDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeGroup">Online Documentation</a>
 */
final val nodeGroup: ICanvasObjectGroup
/**
 * Gets or sets the [ICanvasObjectDescriptor] instance used for installing an [ILabel] of an [INode] into the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelDescriptor">Online Documentation</a>
 */
final var nodeLabelDescriptor: ICanvasObjectDescriptor<ILabel>
/**
 * Gets the [ICanvasObjectGroup] instance that will be used for installing node label styles.
 * @see [getLabelCanvasObjectGroup]
 * @see [nodeLabelDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelGroup">Online Documentation</a>
 */
final val nodeLabelGroup: ICanvasObjectGroup
/**
 * Gets or sets the policy to determines at which visual layer node labels shall be inserted.
 * 
 * The default value is [LabelLayerPolicy.SEPARATE_LAYER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelLayerPolicy">Online Documentation</a>
 */
final var nodeLabelLayerPolicy: LabelLayerPolicy
/**
 * Provides access to the [ItemModelManager] which handles the [ILabel]s at nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelManager">Online Documentation</a>
 */
final val nodeLabelManager: ItemModelManager<ILabel>
/**
 * Provides access to the [ItemModelManager] which handles the [INode]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeManager">Online Documentation</a>
 */
final val nodeManager: ItemModelManager<INode>
/**
 * Gets or sets the [ICanvasObjectDescriptor] instance used for installing an [IPort] into the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portDescriptor">Online Documentation</a>
 */
final var portDescriptor: ICanvasObjectDescriptor<IPort>
/**
 * Gets the [ICanvasObjectGroup] instance that will be used for installing port styles.
 * @see [getPortCanvasObjectGroup]
 * @see [portDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portGroup">Online Documentation</a>
 */
final val portGroup: ICanvasObjectGroup
/**
 * Gets or sets the [ICanvasObjectDescriptor] instance used for installing an [ILabel] of an [IPort] into the canvas.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelDescriptor">Online Documentation</a>
 */
final var portLabelDescriptor: ICanvasObjectDescriptor<ILabel>
/**
 * Gets the [ICanvasObjectGroup] instance that will be used for installing port label styles.
 * @see [getLabelCanvasObjectGroup]
 * @see [portLabelDescriptor]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelGroup">Online Documentation</a>
 */
final val portLabelGroup: ICanvasObjectGroup
/**
 * Gets or sets the policy to determines at which visual layer port labels shall be inserted.
 * 
 * The default value is [LabelLayerPolicy.SEPARATE_LAYER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelLayerPolicy">Online Documentation</a>
 */
final var portLabelLayerPolicy: LabelLayerPolicy
/**
 * Provides access to the [ItemModelManager] which handles the [ILabel]s at ports.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelManager">Online Documentation</a>
 */
final val portLabelManager: ItemModelManager<ILabel>
/**
 * Gets or sets the policy to determines at which visual layer node and edge ports shall be inserted.
 * 
 * The default value is [PortLayerPolicy.SEPARATE_LAYER].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLayerPolicy">Online Documentation</a>
 */
final var portLayerPolicy: PortLayerPolicy
/**
 * Provides access to the [ItemModelManager] which handles the [IPort]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portManager">Online Documentation</a>
 */
final val portManager: ItemModelManager<IPort>
/**
 * Gets or sets if the [ICanvasObject.userObject] should be provided by its [main canvas object][getMainCanvasObject].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23provideUserObjectOnMainCanvasObject">Online Documentation</a>
 */
final var provideUserObjectOnMainCanvasObject: Boolean
/**
 * Compares two items with respect to their rendering order.
 * @param [item1] the first item to compare
 * @param [item2] the second item to compare
 * @return 0 if item1 == item2, > 0 if item1 is rendered behind item2, < 0 if item1 is rendered in front of item2. Items that are not part of the visualization are always considered to be rendered first.
 * @see [comparer]
 * @see [CanvasComponent.compareRenderOrder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-compare">Online Documentation</a>
 */
 open   fun compare( item1: IModelItem ,
 item2: IModelItem ):Int
/**
 * Factory method that creates the [contentGroup]
 * 
 * The default implementation will just add another group to the [CanvasComponent].
 * @return The group to use for adding the content.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createContentGroup">Online Documentation</a>
 */
 open protected   fun createContentGroup():ICanvasObjectGroup
/**
 * Factory method for the [edgeGroup] property.
 * @return a new group that has been added to the [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeGroup">Online Documentation</a>
 */
 open protected   fun createEdgeGroup():ICanvasObjectGroup
/**
 * Factory method for the [edgeLabelGroup] property.
 * @return a new group that has been added to the [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeLabelGroup">Online Documentation</a>
 */
 open protected   fun createEdgeLabelGroup():ICanvasObjectGroup
/**
 * Factory method for creating the [ItemModelManager] that handles the visual representation of [edge labels][ILabel].
 * @param [descriptor] An [ICanvasObjectDescriptor] for [edge labels][ILabel].
 * @param [callback] A callback to get the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given edge label.
 * @return a new instance of [ItemModelManager] for edge labels
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeLabelModelManager">Online Documentation</a>
 */
 open protected   fun createEdgeLabelModelManager( descriptor: ICanvasObjectDescriptor<ILabel> ,
 callback: Func2<ILabel, ICanvasObjectGroup> ):ItemModelManager<ILabel>
/**
 * Factory method for creating the [ItemModelManager] that handles the visual representation of [edges][IEdge].
 * @param [descriptor] An [ICanvasObjectDescriptor] for [IEdge]s.
 * @param [callback] A callback to get the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given edge.
 * @return a new instance of [ItemModelManager] for edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeModelManager">Online Documentation</a>
 */
 open protected   fun createEdgeModelManager( descriptor: ICanvasObjectDescriptor<IEdge> ,
 callback: Func2<IEdge, ICanvasObjectGroup> ):ItemModelManager<IEdge>
/**
 * Factory method for the [groupNodeGroup] property.
 * @return a new group that has been added to the [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createGroupNodeGroup">Online Documentation</a>
 */
 open protected   fun createGroupNodeGroup():ICanvasObjectGroup
/**
 * Gets a [IHitTester] that can be used to enumerate hits on the canvas at a given world coordinate position.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createHitTester">Online Documentation</a>
 */
 open   fun <T : IModelItem>createHitTester( itemType: YClass<T> ):IHitTester<T>
/**
 * Factory method for the [nodeGroup] property.
 * @return a new group that has been added to the [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeGroup">Online Documentation</a>
 */
 open protected   fun createNodeGroup():ICanvasObjectGroup
/**
 * Factory method for the [nodeLabelGroup] property.
 * @return a new group that has been added to the [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeLabelGroup">Online Documentation</a>
 */
 open protected   fun createNodeLabelGroup():ICanvasObjectGroup
/**
 * Factory method for creating the [ItemModelManager] that handles the visual representation of [node labels][ILabel].
 * @param [descriptor] An [ICanvasObjectDescriptor] for [node labels][ILabel].
 * @param [callback] A callback to get the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given node label.
 * @return a new instance of [ItemModelManager] for node labels
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeLabelModelManager">Online Documentation</a>
 */
 open protected   fun createNodeLabelModelManager( descriptor: ICanvasObjectDescriptor<ILabel> ,
 callback: Func2<ILabel, ICanvasObjectGroup> ):ItemModelManager<ILabel>
/**
 * Factory method for creating the [ItemModelManager] that handles the visual representation of [nodes][INode].
 * @param [descriptor] An [ICanvasObjectDescriptor] for [INode]s.
 * @param [callback] A callback to get the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given node.
 * @return a new instance of [ItemModelManager] for nodes
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeModelManager">Online Documentation</a>
 */
 open protected   fun createNodeModelManager( descriptor: ICanvasObjectDescriptor<INode> ,
 callback: Func2<INode, ICanvasObjectGroup> ):ItemModelManager<INode>
/**
 * Factory method for the [portGroup] property.
 * @return a new group that has been added to the [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortGroup">Online Documentation</a>
 */
 open protected   fun createPortGroup():ICanvasObjectGroup
/**
 * Factory method for the [portLabelGroup] property.
 * @return a new group that has been added to the [contentGroup]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortLabelGroup">Online Documentation</a>
 */
 open protected   fun createPortLabelGroup():ICanvasObjectGroup
/**
 * Factory method for creating the [ItemModelManager] that handles the visual representation of [port labels][ILabel].
 * @param [descriptor] An [ICanvasObjectDescriptor] for [port labels][ILabel].
 * @param [callback] A callback to get the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given port label.
 * @return a new instance of [ItemModelManager] for port labels
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortLabelModelManager">Online Documentation</a>
 */
 open protected   fun createPortLabelModelManager( descriptor: ICanvasObjectDescriptor<ILabel> ,
 callback: Func2<ILabel, ICanvasObjectGroup> ):ItemModelManager<ILabel>
/**
 * Factory method for creating the [ItemModelManager] that handles the visual representation of [ports][IPort].
 * @param [descriptor] An [ICanvasObjectDescriptor] for [IPort]s.
 * @param [callback] A callback to get the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given port.
 * @return a new instance of [ItemModelManager] for ports
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortModelManager">Online Documentation</a>
 */
 open protected   fun createPortModelManager( descriptor: ICanvasObjectDescriptor<IPort> ,
 callback: Func2<IPort, ICanvasObjectGroup> ):ItemModelManager<IPort>
/**
 * Retrieves the [ICanvasObject] visualizing a given model item managed by this instance.
 * @param [item] the item
 * @return the canvas object for the given item or `null`
 * @see [ItemModelManager.getCanvasObject]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getCanvasObject">Online Documentation</a>
 */
 open   fun getCanvasObject( item: IModelItem ):ICanvasObject?
/**
 * Retrieves the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given edge.
 * @param [edge] The edge that will be installed in the canvas.
 * @return The group to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getEdgeCanvasObjectGroup">Online Documentation</a>
 */
 open protected   fun getEdgeCanvasObjectGroup( edge: IEdge ):ICanvasObjectGroup
/**
 * Retrieves the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given label.
 * @param [label] The label that will be installed in the canvas.
 * @return The group to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getLabelCanvasObjectGroup">Online Documentation</a>
 */
 open protected   fun getLabelCanvasObjectGroup( label: ILabel ):ICanvasObjectGroup
/**
 * Retrieves the [ICanvasObject] for a given model item that can be used for z-order or visibility operations.
 * @param [item] the item
 * @return The main canvas object for the given item or `null`
 * @see [ItemModelManager.getCanvasObject]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getMainCanvasObject">Online Documentation</a>
 */
 open   fun getMainCanvasObject( item: IModelItem ):ICanvasObject?
/**
 * Retrieves the corresponding [IModelItem] for the given canvas object.
 * @param [canvasObject] the instance to use for the query
 * @return The item that is associated with the object or `null`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getModelItem">Online Documentation</a>
 */
 open   fun getModelItem( canvasObject: ICanvasObject ):IModelItem?
/**
 * Retrieves the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given node.
 * @param [node] The node that will be installed in the canvas.
 * @return The group to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getNodeCanvasObjectGroup">Online Documentation</a>
 */
 open protected   fun getNodeCanvasObjectGroup( node: INode ):ICanvasObjectGroup
/**
 * Retrieves the [ICanvasObjectGroup] containing the [canvas object][getCanvasObject] of a given port.
 * @param [port] The port that will be installed in the canvas.
 * @return The group to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getPortCanvasObjectGroup">Online Documentation</a>
 */
 open protected   fun getPortCanvasObjectGroup( port: IPort ):ICanvasObjectGroup
/**
 * Enumerates hits on the canvas at a given world coordinate position.
 * @param [location] the world coordinates to perform the hit test
 * @return an enumerable that will enumerate the hits at the given coordinates
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-hitElementsAt(Point)">Online Documentation</a>
 */
 open   fun hitElementsAt( location: Point ):IEnumerable<IModelItem>
/**
 * Enumerates hits on the canvas at a given world coordinate position for a given context.
 * @param [context] The context to provide to [IHitTestable.isHit][yfiles.input.IHitTestable.isHit]
 * @param [location] the world coordinates to perform the hit test
 * @param [root] The group to search the subtree of.
 * @return an enumerable that will enumerate the hits at the given coordinates
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-hitElementsAt(IInputModeContext,Point,ICanvasObjectGroup)">Online Documentation</a>
 */
 open   fun hitElementsAt( context: IInputModeContext ,
 location: Point ,
 root: ICanvasObjectGroup ):IEnumerable<IModelItem>
/**
 * Installs this manager for the specified [CanvasComponent].
 * @param [canvas] The [CanvasComponent].
 * @param [graph] The [graph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-install">Online Documentation</a>
 */
 open   fun install( canvas: CanvasComponent ,
 graph: IGraph )
/**
 * Lowers the visual representation of the `item` below its current predecessor.
 * @param [item] The model item to lower.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-lower(IModelItem)">Online Documentation</a>
 */
 open   fun lower( item: IModelItem )
/**
 * Lowers the visual representations of all [IModelItem]s in `items` below their current predecessors.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-lower(IEnumerable)">Online Documentation</a>
 */
 open   fun lower( items: IEnumerable<IModelItem> )
/**
 * Called when the [graph] property changes.
 * @param [oldGraph] The old graph instance.
 * @param [newGraph] The new graph instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-onGraphChanged">Online Documentation</a>
 */
 open protected   fun onGraphChanged( oldGraph: IGraph? ,
 newGraph: IGraph? )
/**
 * Raises the visual representation of the `item` above its current successor.
 * @param [item] The model item to raise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-raise(IModelItem)">Online Documentation</a>
 */
 open   fun raise( item: IModelItem )
/**
 * Raises the visual representations of all [IModelItem]s in `items` above their current successors.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-raise(IEnumerable)">Online Documentation</a>
 */
 open   fun raise( items: IEnumerable<IModelItem> )
/**
 * Lowers the visual representation of the `item` to the back.
 * @param [item] The model item to lower to the back.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toBack(IModelItem)">Online Documentation</a>
 */
 open   fun toBack( item: IModelItem )
/**
 * Lowers the visual representation of all [IModelItem]s in `items` to the back.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toBack(IEnumerable)">Online Documentation</a>
 */
 open   fun toBack( items: IEnumerable<IModelItem> )
/**
 * Raises the visual representation of the `item` to the front.
 * @param [item] The model item to raise to the front.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toFront(IModelItem)">Online Documentation</a>
 */
 open   fun toFront( item: IModelItem )
/**
 * Raises the visual representations of all [IModelItem]s in `items` to the front.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toFront(IEnumerable)">Online Documentation</a>
 */
 open   fun toFront( items: IEnumerable<IModelItem> )
/**
 * Enumerates hits on the canvas at a given world coordinate position.
 * @param [location] the world coordinates to perform the hit test
 * @return an enumerable that will enumerate the hits at the given coordinates
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-typedHitElementsAt(yfiles.lang.Class,Point)">Online Documentation</a>
 */
 open   fun <T : IModelItem>typedHitElementsAt( itemType: YClass<T> ,
 location: Point ):IEnumerable<T>
/**
 * Enumerates hits on the canvas at a given world coordinate position in a given context.
 * @param [context] The context to provide to [IHitTestable.isHit][yfiles.input.IHitTestable.isHit]
 * @param [location] the world coordinates to perform the hit test
 * @param [root] The group to search the subtree of.
 * @return an enumerable that will enumerate the hits at the given coordinates
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-typedHitElementsAt(yfiles.lang.Class,IInputModeContext,Point,ICanvasObjectGroup)">Online Documentation</a>
 */
 open   fun <T : IModelItem>typedHitElementsAt( modelItemType: YClass<T> ,
 context: IInputModeContext ,
 location: Point ,
 root: ICanvasObjectGroup ):IEnumerable<T>
/**
 * Reverts the [install] method.
 * @param [canvas] The [CanvasComponent].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-uninstall">Online Documentation</a>
 */
 open   fun uninstall( canvas: CanvasComponent )
/**
 * [Updates][CollectionModelManager.update] the visual representation of the given item.
 * @param [item] The item to update the visual representation
 * @see [CollectionModelManager.update]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-update">Online Documentation</a>
 */
 open   fun update( item: IModelItem )

companion object : ClassMetadata<GraphModelManager> {
/**
 * The immutable instance of the default [ICanvasObjectDescriptor] for [IEdge]s which simply defers to the edge's [IEdgeStyle][yfiles.styles.IEdgeStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_EDGE_DESCRIPTOR">Online Documentation</a>
 */
 val DEFAULT_EDGE_DESCRIPTOR: ICanvasObjectDescriptor<IEdge>
/**
 * The immutable instance of the default [ICanvasObjectDescriptor] for [ILabel]s which simply defers to the label's [ILabelStyle][yfiles.styles.ILabelStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_LABEL_DESCRIPTOR">Online Documentation</a>
 */
 val DEFAULT_LABEL_DESCRIPTOR: ICanvasObjectDescriptor<ILabel>
/**
 * The immutable instance of the default [ICanvasObjectDescriptor] for [INode]s which simply defers to the node's [INodeStyle][yfiles.styles.INodeStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_NODE_DESCRIPTOR">Online Documentation</a>
 */
 val DEFAULT_NODE_DESCRIPTOR: ICanvasObjectDescriptor<INode>
/**
 * The immutable instance of the default [ICanvasObjectDescriptor] for [IPort]s which simply defers to the port's [IPortStyle][yfiles.styles.IPortStyle].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_PORT_DESCRIPTOR">Online Documentation</a>
 */
 val DEFAULT_PORT_DESCRIPTOR: ICanvasObjectDescriptor<IPort>
}
}

inline fun GraphModelManager(
    block: GraphModelManager.() -> Unit
): GraphModelManager {
    return GraphModelManager()
        .apply(block)
}
