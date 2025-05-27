// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.graph.GraphItemTypes
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.graph.IPort
import yfiles.input.IHitTester
import yfiles.input.IInputModeContext
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1
import yfiles.lang.Func2

/**
 * Manages the visual appearance of an [IGraph] instance in a [CanvasComponent].
 * @see [nodeGroup]
 * @see [hierarchicalNestingPolicy]
 * @see [LabelLayerPolicy]
 * @see [PortLayerPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager">Online Documentation</a>
 * 
 * @constructor Creates a new manager instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-constructor-GraphModelManager">Online Documentation</a>
 */
open external class GraphModelManager ()  {
  /**
   * Gets the currently installed in [CanvasComponent].
   * @see [install]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23canvasComponent">Online Documentation</a>
   */
  protected final val canvasComponent: CanvasComponent?
  
  /**
   * Gets the content group this manager instance uses to add visual representation of the graph to.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23contentGroup">Online Documentation</a>
   */
  final val contentGroup: IRenderTreeGroup?
  
  /**
   * Gets the [IRenderTreeGroup] instance that will be used for installing edge styles.
   * @see [getEdgeRenderTreeGroup]
   * @see [edgeRenderer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeGroup">Online Documentation</a>
   */
  final val edgeGroup: IRenderTreeGroup
  
  /**
   * Gets the [IRenderTreeGroup] instance that will be used for installing edge label styles.
   * @see [getLabelRenderTreeGroup]
   * @see [edgeLabelRenderer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelGroup">Online Documentation</a>
   */
  final val edgeLabelGroup: IRenderTreeGroup
  
  /**
   * Gets or sets the policy to determine at which visual layer edge labels shall be inserted.
   * 
   * The default value is [SEPARATE_LAYER][LabelLayerPolicy].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelLayerPolicy">Online Documentation</a>
   */
  final var edgeLabelLayerPolicy: LabelLayerPolicy
  
  /**
   * Provides access to the [ItemModelManager] which handles the [ILabel]s at edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelManager">Online Documentation</a>
   */
  final val edgeLabelManager: ItemModelManager<ILabel>
  
  /**
   * Gets or sets the [IObjectRenderer] instance used for installing an [ILabel] of an [IEdge] into the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeLabelRenderer">Online Documentation</a>
   */
  final var edgeLabelRenderer: IObjectRenderer<ILabel>
  
  /**
   * Provides access to the [ItemModelManager] which handles the [IEdge]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeManager">Online Documentation</a>
   */
  final val edgeManager: ItemModelManager<IEdge>
  
  /**
   * Gets or sets the [IObjectRenderer] instance used for installing an [IEdge] into the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23edgeRenderer">Online Documentation</a>
   */
  final var edgeRenderer: IObjectRenderer<IEdge>
  
  /**
   * Gets or sets the graph this manager manages.
   * @see [onGraphChanged]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23graph">Online Documentation</a>
   */
  final var graph: IGraph?
  
  /**
   * Gets the [IRenderTreeGroup] instance that will be used for installing node styles of [group nodes][IGraph].
   * @see [getNodeRenderTreeGroup]
   * @see [nodeRenderer]
   * @see [hierarchicalNestingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23groupNodeGroup">Online Documentation</a>
   */
  final val groupNodeGroup: IRenderTreeGroup
  
  /**
   * Gets or sets the policy whether and how this instance should nest the nodes and edges if the graph is grouped.
   * 
   * The default is [NODES_AND_EDGES][HierarchicalNestingPolicy].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23hierarchicalNestingPolicy">Online Documentation</a>
   */
  final var hierarchicalNestingPolicy: HierarchicalNestingPolicy
  
  /**
   * Gets a [IHitTester] that can be used to enumerate hits on the canvas at a given world coordinate position.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23hitTester">Online Documentation</a>
   */
  final val hitTester: IHitTester
  
  /**
   * Gets the [IRenderTreeGroup] instance that will be used for installing node styles.
   * @see [getNodeRenderTreeGroup]
   * @see [getMainRenderTreeElement]
   * @see [nodeRenderer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeGroup">Online Documentation</a>
   */
  final val nodeGroup: IRenderTreeGroup
  
  /**
   * Gets the [IRenderTreeGroup] instance that will be used for installing node label styles.
   * @see [getLabelRenderTreeGroup]
   * @see [nodeLabelRenderer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelGroup">Online Documentation</a>
   */
  final val nodeLabelGroup: IRenderTreeGroup
  
  /**
   * Gets or sets the policy to determine at which visual layer node labels shall be inserted.
   * 
   * The default value is [SEPARATE_LAYER][LabelLayerPolicy].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelLayerPolicy">Online Documentation</a>
   */
  final var nodeLabelLayerPolicy: LabelLayerPolicy
  
  /**
   * Provides access to the [ItemModelManager] which handles the [ILabel]s at nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelManager">Online Documentation</a>
   */
  final val nodeLabelManager: ItemModelManager<ILabel>
  
  /**
   * Gets or sets the [IObjectRenderer] instance used for installing an [ILabel] of an [INode] into the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeLabelRenderer">Online Documentation</a>
   */
  final var nodeLabelRenderer: IObjectRenderer<ILabel>
  
  /**
   * Provides access to the [ItemModelManager] which handles the [INode]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeManager">Online Documentation</a>
   */
  final val nodeManager: ItemModelManager<INode>
  
  /**
   * Gets or sets the [IObjectRenderer] instance used for installing an [INode] into the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23nodeRenderer">Online Documentation</a>
   */
  final var nodeRenderer: IObjectRenderer<INode>
  
  /**
   * Gets the [IRenderTreeGroup] instance that will be used for installing port styles.
   * @see [getPortRenderTreeGroup]
   * @see [portRenderer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portGroup">Online Documentation</a>
   */
  final val portGroup: IRenderTreeGroup
  
  /**
   * Gets the [IRenderTreeGroup] instance that will be used for installing port label styles.
   * @see [getLabelRenderTreeGroup]
   * @see [portLabelRenderer]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelGroup">Online Documentation</a>
   */
  final val portLabelGroup: IRenderTreeGroup
  
  /**
   * Gets or sets the policy to determine at which visual layer port labels shall be inserted.
   * 
   * The default value is [SEPARATE_LAYER][LabelLayerPolicy].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelLayerPolicy">Online Documentation</a>
   */
  final var portLabelLayerPolicy: LabelLayerPolicy
  
  /**
   * Provides access to the [ItemModelManager] which handles the [ILabel]s at ports.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelManager">Online Documentation</a>
   */
  final val portLabelManager: ItemModelManager<ILabel>
  
  /**
   * Gets or sets the [IObjectRenderer] instance used for installing an [ILabel] of an [IPort] into the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLabelRenderer">Online Documentation</a>
   */
  final var portLabelRenderer: IObjectRenderer<ILabel>
  
  /**
   * Gets or sets the policy to determine at which visual layer node and edge ports shall be inserted.
   * 
   * The default value is [SEPARATE_LAYER][PortLayerPolicy].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portLayerPolicy">Online Documentation</a>
   */
  final var portLayerPolicy: PortLayerPolicy
  
  /**
   * Provides access to the [ItemModelManager] which handles the [IPort]s.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portManager">Online Documentation</a>
   */
  final val portManager: ItemModelManager<IPort>
  
  /**
   * Gets or sets the [IObjectRenderer] instance used for installing an [IPort] into the canvas.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23portRenderer">Online Documentation</a>
   */
  final var portRenderer: IObjectRenderer<IPort>
  
  /**
   * Gets or sets if the [tag][IRenderTreeElement] should be provided by its [main render tree element][GraphModelManager].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23provideRenderTagOnMainRenderTreeElement">Online Documentation</a>
   */
  final var provideRenderTagOnMainRenderTreeElement: Boolean
  
  /**
   * Gets an comparison instance that can be used to compare two model items with respect to their visual display order.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23renderOrderComparator">Online Documentation</a>
   */
  final val renderOrderComparator: Comparison1<IModelItem>
  
  /**
   * Compares two items with respect to their rendering order.
   * @param [item1] the first item to compare
   * @param [item2] the second item to compare
   * @return 0 if item1 == item2, > 0 if item1 is rendered behind item2, < 0 if item1 is rendered in front of item2. Items that are not part of the visualization are always considered to be rendered first.
   * @see [renderOrderComparator]
   * @see [RenderTree.renderOrderComparator]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-compareRenderOrder">Online Documentation</a>
   */
  open fun compareRenderOrder(
    item1: IModelItem,
    item2: IModelItem,
  ): Int
  
  /**
   * Factory method for the [edgeGroup][GraphModelManager] property.
   * @return a new group that has been added to the [contentGroup][GraphModelManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeGroup">Online Documentation</a>
   */
  protected open fun createEdgeGroup(): IRenderTreeGroup
  
  /**
   * Factory method for the [edgeLabelGroup][GraphModelManager] property.
   * @return a new group that has been added to the [contentGroup][GraphModelManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeLabelGroup">Online Documentation</a>
   */
  protected open fun createEdgeLabelGroup(): IRenderTreeGroup
  
  /**
   * Factory method for creating the [ItemModelManager] that handles the visual representation of [edge labels][ILabel].
   * @param [renderer] An [IObjectRenderer] for [edge labels][ILabel].
   * @param [callback] A callback to get the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given edge label.
   * @return a new instance of [ItemModelManager] for edge labels
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeLabelModelManager">Online Documentation</a>
   */
  protected open fun createEdgeLabelModelManager(
    renderer: IObjectRenderer<ILabel>,
    callback: Func2<ILabel, IRenderTreeGroup>,
  ): ItemModelManager<ILabel>
  
  /**
   * Factory method for creating the [ItemModelManager] that handles the visual representation of [edges][IEdge].
   * @param [renderer] An [IObjectRenderer] for [IEdge]s.
   * @param [callback] A callback to get the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given edge.
   * @return a new instance of [ItemModelManager] for edges
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createEdgeModelManager">Online Documentation</a>
   */
  protected open fun createEdgeModelManager(
    renderer: IObjectRenderer<IEdge>,
    callback: Func2<IEdge, IRenderTreeGroup>,
  ): ItemModelManager<IEdge>
  
  /**
   * Factory method for the [groupNodeGroup][GraphModelManager] property.
   * @return a new group that has been added to the [contentGroup][GraphModelManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createGroupNodeGroup">Online Documentation</a>
   */
  protected open fun createGroupNodeGroup(): IRenderTreeGroup
  
  /**
   * Factory method for the [nodeGroup][GraphModelManager] property.
   * @return a new group that has been added to the [contentGroup][GraphModelManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeGroup">Online Documentation</a>
   */
  protected open fun createNodeGroup(): IRenderTreeGroup
  
  /**
   * Factory method for the [nodeLabelGroup][GraphModelManager] property.
   * @return a new group that has been added to the [contentGroup][GraphModelManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeLabelGroup">Online Documentation</a>
   */
  protected open fun createNodeLabelGroup(): IRenderTreeGroup
  
  /**
   * Factory method for creating the [ItemModelManager] that handles the visual representation of [node labels][ILabel].
   * @param [renderer] An [IObjectRenderer] for [node labels][ILabel].
   * @param [callback] A callback to get the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given node label.
   * @return a new instance of [ItemModelManager] for node labels
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeLabelModelManager">Online Documentation</a>
   */
  protected open fun createNodeLabelModelManager(
    renderer: IObjectRenderer<ILabel>,
    callback: Func2<ILabel, IRenderTreeGroup>,
  ): ItemModelManager<ILabel>
  
  /**
   * Factory method for creating the [ItemModelManager] that handles the visual representation of [nodes][INode].
   * @param [renderer] An [IObjectRenderer] for [INode]s.
   * @param [callback] A callback to get the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given node.
   * @return a new instance of [ItemModelManager] for nodes
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createNodeModelManager">Online Documentation</a>
   */
  protected open fun createNodeModelManager(
    renderer: IObjectRenderer<INode>,
    callback: Func2<INode, IRenderTreeGroup>,
  ): ItemModelManager<INode>
  
  /**
   * Factory method for the [portGroup][GraphModelManager] property.
   * @return a new group that has been added to the [contentGroup][GraphModelManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortGroup">Online Documentation</a>
   */
  protected open fun createPortGroup(): IRenderTreeGroup
  
  /**
   * Factory method for the [portLabelGroup][GraphModelManager] property.
   * @return a new group that has been added to the [contentGroup][GraphModelManager]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortLabelGroup">Online Documentation</a>
   */
  protected open fun createPortLabelGroup(): IRenderTreeGroup
  
  /**
   * Factory method for creating the [ItemModelManager] that handles the visual representation of [port labels][ILabel].
   * @param [renderer] An [IObjectRenderer] for [port labels][ILabel].
   * @param [callback] A callback to get the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given port label.
   * @return a new instance of [ItemModelManager] for port labels
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortLabelModelManager">Online Documentation</a>
   */
  protected open fun createPortLabelModelManager(
    renderer: IObjectRenderer<ILabel>,
    callback: Func2<ILabel, IRenderTreeGroup>,
  ): ItemModelManager<ILabel>
  
  /**
   * Factory method for creating the [ItemModelManager] that handles the visual representation of [ports][IPort].
   * @param [renderer] An [IObjectRenderer] for [IPort]s.
   * @param [callback] A callback to get the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given port.
   * @return a new instance of [ItemModelManager] for ports
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-createPortModelManager">Online Documentation</a>
   */
  protected open fun createPortModelManager(
    renderer: IObjectRenderer<IPort>,
    callback: Func2<IPort, IRenderTreeGroup>,
  ): ItemModelManager<IPort>
  
  /**
   * Retrieves the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given edge.
   * @param [edge] The edge that will be installed in the canvas.
   * @return The group to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getEdgeRenderTreeGroup">Online Documentation</a>
   */
  protected open fun getEdgeRenderTreeGroup(
    edge: IEdge,
  ): IRenderTreeGroup
  
  /**
   * Retrieves the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given label.
   * @param [label] The label that will be installed in the canvas.
   * @return The group to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getLabelRenderTreeGroup">Online Documentation</a>
   */
  protected open fun getLabelRenderTreeGroup(
    label: ILabel,
  ): IRenderTreeGroup
  
  /**
   * Retrieves the [IRenderTreeElement] for a given model item that can be used for z-order or visibility operations.
   * @param [item] the item
   * @return The main render tree element for the given item or `null`
   * @see [ItemModelManager.getRenderTreeElement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getMainRenderTreeElement">Online Documentation</a>
   */
  open fun getMainRenderTreeElement(
    item: IModelItem,
  ): IRenderTreeElement?
  
  /**
   * Retrieves the corresponding [IModelItem] for the given render tree element.
   * @param [renderTreeElement] The instance to use for the query
   * @return The item that is associated with the render tree element or `null`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getModelItem">Online Documentation</a>
   */
  open fun getModelItem(
    renderTreeElement: IRenderTreeElement,
  ): IModelItem?
  
  /**
   * Retrieves the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given node.
   * @param [node] The node that will be installed in the canvas.
   * @return The group to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getNodeRenderTreeGroup">Online Documentation</a>
   */
  protected open fun getNodeRenderTreeGroup(
    node: INode,
  ): IRenderTreeGroup
  
  /**
   * Retrieves the [IRenderTreeGroup] containing the [render tree element][GraphModelManager] of a given port.
   * @param [port] The port that will be installed in the canvas.
   * @return The group to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getPortRenderTreeGroup">Online Documentation</a>
   */
  protected open fun getPortRenderTreeGroup(
    port: IPort,
  ): IRenderTreeGroup
  
  /**
   * Retrieves the [IRenderTreeElement] visualizing a given model item managed by this instance.
   * @param [item] the item
   * @return the render tree element for the given item or `null`
   * @see [ItemModelManager.getRenderTreeElement]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-getRenderTreeElement">Online Documentation</a>
   */
  open fun getRenderTreeElement(
    item: IModelItem,
  ): IRenderTreeElement?
  
  /**
   * Enumerates hits in the render tree of the canvas at a given world coordinate position for a given context and [IRenderTreeGroup].
   * @param [location] the world coordinates to perform the hit test at
   * @param [context] The context to provide to [isHit][yfiles.input.IHitTestable]
   * @param [root] The group to search the subtree of. [contentGroup][GraphModelManager] if not specified.
   * @param [typeFilter] An optional filter that preselects a subset of types that will be tested and reported. This can result in improved performance when testing does not need to be performed.
   * @return a live enumerable that will enumerate the hits at the given coordinates
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-hitElementsAt">Online Documentation</a>
   */
  open fun hitElementsAt(
    location: Point,
    context: IInputModeContext?  = definedExternally,
    root: IRenderTreeGroup?  = definedExternally,
    typeFilter: GraphItemTypes  = definedExternally,
  ): IEnumerable<IModelItem>
  
  /**
   * Installs this instance for the specified [CanvasComponent].
   * @param [canvasComponent] The [CanvasComponent].
   * @param [graph] The [graph][GraphModelManager].
   * @param [contentGroup] The group to add the graph's visual content to. If omitted, the [contentGroup][RenderTree] of the [renderTree][CanvasComponent] of the `canvasComponent` is used.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-install">Online Documentation</a>
   */
  open fun install(
    canvasComponent: CanvasComponent,
    graph: IGraph,
    contentGroup: IRenderTreeGroup?  = definedExternally,
  )
  
  /**
   * Lowers the visual representation of the `item` below its current predecessor.
   * @param [item] The model item to lower.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-lower(IModelItem)">Online Documentation</a>
   */
  open fun lower(
    item: IModelItem,
  )
  
  /**
   * Lowers the visual representations of all [IModelItem]s in `items` below their current predecessors.
   * @param [items] The [IModelItem]s to lower.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-lower(IEnumerable)">Online Documentation</a>
   */
  open fun lower(
    items: IEnumerable<IModelItem>,
  )
  
  /**
   * Called when the [graph][GraphModelManager] property changes.
   * @param [oldGraph] The old graph instance.
   * @param [newGraph] The new graph instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-onGraphChanged">Online Documentation</a>
   */
  protected open fun onGraphChanged(
    oldGraph: IGraph?,
    newGraph: IGraph?,
  )
  
  /**
   * Raises the visual representation of the `item` above its current successor.
   * @param [item] The model item to raise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-raise(IModelItem)">Online Documentation</a>
   */
  open fun raise(
    item: IModelItem,
  )
  
  /**
   * Raises the visual representations of all [IModelItem]s in `items` above their current successors.
   * @param [items] The [IModelItem]s to raise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-raise(IEnumerable)">Online Documentation</a>
   */
  open fun raise(
    items: IEnumerable<IModelItem>,
  )
  
  /**
   * Lowers the visual representation of the `item` to the back.
   * @param [item] The model item to lower to the back.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toBack(IModelItem)">Online Documentation</a>
   */
  open fun toBack(
    item: IModelItem,
  )
  
  /**
   * Lowers the visual representation of all [IModelItem]s in `items` to the back.
   * @param [items] The [IModelItem]s to move to the back.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toBack(IEnumerable)">Online Documentation</a>
   */
  open fun toBack(
    items: IEnumerable<IModelItem>,
  )
  
  /**
   * Raises the visual representation of the `item` to the front.
   * @param [item] The model item to raise to the front.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toFront(IModelItem)">Online Documentation</a>
   */
  open fun toFront(
    item: IModelItem,
  )
  
  /**
   * Raises the visual representations of all [IModelItem]s in `items` to the front.
   * @param [items] The [IModelItem]s to move to the front.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-toFront(IEnumerable)">Online Documentation</a>
   */
  open fun toFront(
    items: IEnumerable<IModelItem>,
  )
  
  /**
   * Reverts the [install][GraphModelManager] method.
   * @param [canvasComponent] The [CanvasComponent].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-uninstall">Online Documentation</a>
   */
  open fun uninstall(
    canvasComponent: CanvasComponent,
  )
  
  /**
   * [Updates][CollectionModelManager] the visual representation of the given item.
   * @param [item] The item to update the visual representation of
   * @see [CollectionModelManager.update]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23GraphModelManager-method-update">Online Documentation</a>
   */
  open fun update(
    item: IModelItem,
  )
  
  companion object : ClassMetadata<GraphModelManager> {
    /**
     * The immutable instance of the default [IObjectRenderer] for [IEdge]s which simply defers to the edge's [IEdgeStyle][yfiles.styles.IEdgeStyle].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_EDGE_RENDERER">Online Documentation</a>
     */
     val DEFAULT_EDGE_RENDERER: IObjectRenderer<IEdge>
    
    /**
     * The immutable instance of the default [IObjectRenderer] for [ILabel]s which simply defers to the label's [ILabelStyle][yfiles.styles.ILabelStyle].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_LABEL_RENDERER">Online Documentation</a>
     */
     val DEFAULT_LABEL_RENDERER: IObjectRenderer<ILabel>
    
    /**
     * The immutable instance of the default [IObjectRenderer] for [INode]s which simply defers to the node's [INodeStyle][yfiles.styles.INodeStyle].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_NODE_RENDERER">Online Documentation</a>
     */
     val DEFAULT_NODE_RENDERER: IObjectRenderer<INode>
    
    /**
     * The immutable instance of the default [IObjectRenderer] for [IPort]s which simply defers to the port's [IPortStyle][yfiles.styles.IPortStyle].
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphModelManager%23DEFAULT_PORT_RENDERER">Online Documentation</a>
     */
     val DEFAULT_PORT_RENDERER: IObjectRenderer<IPort>
  }
}

inline fun GraphModelManager(
    block: GraphModelManager.() -> Unit
): GraphModelManager {
    return GraphModelManager()
        .apply(block)
}
