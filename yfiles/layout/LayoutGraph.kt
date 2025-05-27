// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.collections.IEnumerable
import yfiles.collections.ILinkedItemEnumerable
import yfiles.collections.IMapper
import yfiles.geometry.IOrientedRectangle
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.lang.Comparison1

/**
 * Represents a directed graph structure that contains layout information for its elements and to which layout algorithms ([ILayoutAlgorithm]) can be applied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph">Online Documentation</a>
 * 
 * @constructor Instantiates an empty [LayoutGraph] object.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-constructor-LayoutGraph">Online Documentation</a>
 */
external class LayoutGraph ()  {
  /**
   * Provides an [IEnumerable] of [LayoutBend]s, allowing iteration over all bends of the edges of the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23bends">Online Documentation</a>
   */
  final val bends: IEnumerable<LayoutBend>
  
  /**
   * Gets the context associated with this graph.
   * @see [LayoutGraphContext]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23context">Online Documentation</a>
   */
  final val context: LayoutGraphContext
  
  /**
   * Gets a live view of all [LayoutEdgeLabel] instances contained in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23edgeLabels">Online Documentation</a>
   */
  final val edgeLabels: IEnumerable<LayoutEdgeLabel>
  
  /**
   * Provides a dynamic [IEnumerable] for [LayoutEdge]s, allowing iteration over the edges contained in this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23edges">Online Documentation</a>
   */
  final val edges: ILinkedItemEnumerable<LayoutEdge>
  
  /**
   * Gets a value indicating whether this graph is empty, that is, contains no nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23isEmpty">Online Documentation</a>
   */
  final val isEmpty: Boolean
  
  /**
   * Gets a live view of all [LayoutNodeLabel] instances contained in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23nodeLabels">Online Documentation</a>
   */
  final val nodeLabels: IEnumerable<LayoutNodeLabel>
  
  /**
   * Provides a dynamic [IEnumerable] for [LayoutNode]s, allowing iteration over the nodes contained in this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23nodes">Online Documentation</a>
   */
  final val nodes: ILinkedItemEnumerable<LayoutNode>
  
  /**
   * Creates a new bend point for the given `edge` with the specified coordinates.
   * @param [edge] The edge to which the bend will be added.
   * @param [x] The x-coordinate of the new bend.
   * @param [y] The y-coordinate of the new bend.
   * @param [reference] An optional existing bend adjacent to which the new bend will be created. If omitted, the bend is appended near the edge's target port.
   * @param [insertion] Specifies whether the new bend should be inserted before or after the `reference`. If `reference` is `null`, this parameter is ignored. Use [BEFORE][RelativePosition] to insert the bend in the direction of the source node, or [AFTER][RelativePosition] to insert it toward the target node.
   * @return The newly created [LayoutBend] instance.
   * @throws ArgumentError Thrown if `edge` does not belong to this graph, or if `x` or `y` contain a [NaN][Number] value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-addBend">Online Documentation</a>
   */
  fun addBend(
    edge: LayoutEdge,
    x: Double,
    y: Double,
    reference: LayoutBend  = definedExternally,
    insertion: RelativePosition  = definedExternally,
  ): LayoutBend
  
  /**
   * Creates a new label for the specified `node` with the given layout.
   * @param [node] The node to which the label will be added.
   * @param [layout] An [IOrientedRectangle] that defines the label's boundary and orientation.
   * @return The newly created [LayoutNodeLabel] instance.
   * @throws ArgumentError Thrown if `node` does not belong to this graph, or if the `layout` contains a [NaN][Number] value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-addLabel(LayoutNode,IOrientedRectangle)">Online Documentation</a>
   */
  fun addLabel(
    node: LayoutNode,
    layout: IOrientedRectangle,
  ): LayoutNodeLabel
  
  /**
   * Creates a new label for the specified `edge` with the given layout.
   * @param [edge] The edge to which the label will be added.
   * @param [layout] An [IOrientedRectangle] that defines the label's boundary and orientation.
   * @return The newly created [LayoutEdgeLabel] instance.
   * @throws ArgumentError Thrown if `edge` does not belong to this graph, or if the `layout` contains a [NaN][Number] value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-addLabel(LayoutEdge,IOrientedRectangle)">Online Documentation</a>
   */
  fun addLabel(
    edge: LayoutEdge,
    layout: IOrientedRectangle,
  ): LayoutEdgeLabel
  
  /**
   * Creates a new label for the specified `node` with the given dimensions.
   * @param [node] The node to which the label will be added.
   * @param [width] The width of the label's boundary.
   * @param [height] The height of the label's boundary.
   * @return The newly created [LayoutNodeLabel] instance.
   * @throws ArgumentError Thrown if `node` does not belong to this graph, or if `width` or `height` contain a [NaN][Number] value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-addLabel(LayoutNode,number,number)">Online Documentation</a>
   */
  fun addLabel(
    node: LayoutNode,
    width: Double,
    height: Double,
  ): LayoutNodeLabel
  
  /**
   * Creates a new label for the specified `edge` with the given dimensions.
   * @param [edge] The edge to which the label will be added.
   * @param [width] The width of the label's boundary.
   * @param [height] The height of the label's boundary.
   * @return The newly created [LayoutEdgeLabel] instance.
   * @throws ArgumentError Thrown if `edge` does not belong to this graph, or if `width` or `height` contain a [NaN][Number] value.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-addLabel(LayoutEdge,number,number)">Online Documentation</a>
   */
  fun addLabel(
    edge: LayoutEdge,
    width: Double,
    height: Double,
  ): LayoutEdgeLabel
  
  /**
   * Runs an [ILayoutAlgorithm] synchronously on the given [LayoutGraph], applying the given `layoutData`.
   * @param [layout] The layout.
   * @param [layoutData] The layout data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-defaultmethod-applyLayout">Online Documentation</a>
   */
  fun applyLayout(
    layout: ILayoutAlgorithm,
    layoutData: LayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>  = definedExternally,
  )
  
  /**
   * Redefines the endpoints of the specified edge, changing its [source][LayoutEdge] and [target][LayoutEdge] nodes.
   * @param [edge] The edge to be modified.
   * @param [newSource] The new source node for the specified edge.
   * @param [newTarget] The new target node for the specified edge.
   * @param [sourceReference] Optional. A reference edge for insertion at the new source node. If provided, its target must be the given node `newSource`.
   * @param [sourceInsertion] Optional. Specifies whether to insert the edge immediately [BEFORE][RelativePosition] or [AFTER][RelativePosition] the `sourceReference` edge. This parameter is ignored if the source reference is `null`.
   * @param [targetReference] Optional. A reference edge for insertion at the new target node. If provided, its target must be the given node `newTarget`.
   * @param [targetInsertion] Optional. Specifies whether to insert the edge immediately [BEFORE][RelativePosition] or [AFTER][RelativePosition] the `targetReference` edge. This parameter is ignored if the target reference is `null`.
   * @throws ArgumentError Thrown if the new source or target node is `null`.
   * @throws ArgumentError If the new source is not the [source][LayoutEdge] of the given `sourceReference` edge or the target node is not the [target][LayoutEdge] of the given `targetReference` edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-changeEdge">Online Documentation</a>
   */
  fun changeEdge(
    edge: LayoutEdge,
    newSource: LayoutNode,
    newTarget: LayoutNode,
    sourceReference: LayoutEdge  = definedExternally,
    sourceInsertion: RelativePosition  = definedExternally,
    targetReference: LayoutEdge  = definedExternally,
    targetInsertion: RelativePosition  = definedExternally,
  )
  
  /**
   * Removes all nodes and edges from this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-clear">Online Documentation</a>
   */
  fun clear()
  
  /**
   * Determines whether this graph contains the specified node.
   * @param [node] The node to check for existence in the graph.
   * @return `true` if this graph contains the specified node; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-contains(LayoutNode)">Online Documentation</a>
   */
  operator fun contains(
    node: LayoutNode,
  ): Boolean
  
  /**
   * Determines whether this graph contains the specified edge.
   * @param [edge] The edge to check for existence in the graph.
   * @return `true` if this graph contains the specified edge; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-contains(LayoutEdge)">Online Documentation</a>
   */
  operator fun contains(
    edge: LayoutEdge,
  ): Boolean
  
  /**
   * Determines whether this graph contains the specified node label.
   * @param [label] The node label to check for existence in the graph.
   * @return `true` if this graph contains the specified node label; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-contains(LayoutNodeLabel)">Online Documentation</a>
   */
  operator fun contains(
    label: LayoutNodeLabel,
  ): Boolean
  
  /**
   * Determines whether this graph contains the specified edge label.
   * @param [label] The edge label to check for existence in the graph.
   * @return `true` if this graph contains the specified edge label; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-contains(LayoutEdgeLabel)">Online Documentation</a>
   */
  operator fun contains(
    label: LayoutEdgeLabel,
  ): Boolean
  
  /**
   * Determines whether this graph contains the specified bend.
   * @param [bend] The bend to check for existence in the graph.
   * @return `true` if this graph contains the specified bend; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-contains(LayoutBend)">Online Documentation</a>
   */
  operator fun contains(
    bend: LayoutBend,
  ): Boolean
  
  /**
   * Returns an instance of [CompositeLayoutData] that combines the given instances of [LayoutData].
   * @param [items] the [layout data][LayoutData] instances that should be combined into the created [CompositeLayoutData]
   * @return an instance of [CompositeLayoutData] that combines the given instances of [LayoutData].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-defaultmethod-createCompositeLayoutData">Online Documentation</a>
   */
  fun createCompositeLayoutData(
    vararg items: LayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>,
  ): CompositeLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Creates a new edge between the specified `source` and `target` nodes.
   * @param [source] The source node of the edge.
   * @param [target] The target node of the edge.
   * @param [sourceReference] The reference edge for positioning at the source node.
   * @param [sourceInsertion] Defines whether the edge is inserted before or after `sourceReference`.
   * @param [targetReference] The reference edge for positioning at the target node.
   * @param [targetInsertion] Defines whether the edge is inserted before or after `targetReference`.
   * @return The newly created edge.
   * @throws ArgumentError Thrown if `source`, `target`, the source of `sourceReference` or the target of `targetReference` are not part of this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createEdge">Online Documentation</a>
   */
  fun createEdge(
    source: LayoutNode,
    target: LayoutNode,
    sourceReference: LayoutEdge  = definedExternally,
    sourceInsertion: RelativePosition  = definedExternally,
    targetReference: LayoutEdge  = definedExternally,
    targetInsertion: RelativePosition  = definedExternally,
  ): LayoutEdge
  
  /**
   * Creates a new [IMapper] that is valid for the edges in this graph.
   * @param [TValue] The type of the values to be associated with each edge.
   * @param [fallbackValue] A value of type `TValue` used as fallback if the registered [IMapper] is indexed with a key which is not present.
   * @return A newly created [IMapper] instance that is valid for the edges in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createEdgeDataMap">Online Documentation</a>
   */
  fun <TValue> createEdgeDataMap(
    fallbackValue: TValue  = definedExternally,
  ): IMapper<LayoutEdge, TValue>
  
  /**
   * Returns an instance of [LayoutData] that can be used to easily associate custom item-specific data with a [LayoutGraph].
   * @return an instance of [GenericLayoutData] that can be used to easily associate custom item-specific data with a `graph`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-defaultmethod-createGenericLayoutData">Online Documentation</a>
   */
  fun createGenericLayoutData(): GenericLayoutData<LayoutNode, LayoutEdge, LayoutNodeLabel, LayoutEdgeLabel>
  
  /**
   * Creates a new group node as a direct descendant of `parent` using the optional specified layout.
   * @param [parent] The parent node in the grouping hierarchy. If `null`, the new group node becomes a top-level group node. Use [setParent][LayoutGraph] to change the parent after creation.
   * @param [layout] The initial layout for the group node. If not specified, the node is positioned at (0, 0) with a size of 30x30.
   * @return The newly created group node.
   * @throws ArgumentError Thrown if `parent` is not contained in this graph.
   * @see [setParent]
   * @see [getParent]
   * @see [LayoutNode.layout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createGroupNode">Online Documentation</a>
   */
  fun createGroupNode(
    parent: LayoutNode?  = definedExternally,
    layout: Rect  = definedExternally,
  ): LayoutNode
  
  /**
   * Creates a new node using the specified layout.
   * @param [layout] The layout to use for the node's initial position and size.
   * @return The newly created node.
   * @see [LayoutNode.layout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createNode(Rect)">Online Documentation</a>
   */
  fun createNode(
    layout: Rect,
  ): LayoutNode
  
  /**
   * Creates a new node as a direct descendant of `parent` using the optional specified layout.
   * @param [parent] The parent node in the grouping hierarchy. If `null`, the new node becomes a top-level node. To change the parent after creation, use [setParent][LayoutGraph].
   * @param [layout] The initial layout for the node, including position and size. The layout is copied to the node's [layout][LayoutNode] property. If not specified, the node's position is set to (0, 0), and its size is set to 30x30.
   * @return The newly created node.
   * @throws ArgumentError Thrown if `parent` is not a valid node in this graph or if `layout` contains invalid values (e.g., [NaN][Number]).
   * @see [setParent]
   * @see [getParent]
   * @see [LayoutNode.layout]
   * @see [createNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createNode(LayoutNode,Rect)">Online Documentation</a>
   */
  fun createNode(
    parent: LayoutNode?  = definedExternally,
    layout: Rect  = definedExternally,
  ): LayoutNode
  
  /**
   * Creates a new [IMapper] that is valid for the nodes in this graph.
   * @param [TValue] The type of the values to be associated with each node.
   * @param [fallbackValue] A value of type `TValue` used as fallback if the registered [IMapper] is indexed with a key which is not present.
   * @return A newly created [IMapper] instance that is valid for the nodes in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createNodeDataMap">Online Documentation</a>
   */
  fun <TValue> createNodeDataMap(
    fallbackValue: TValue  = definedExternally,
  ): IMapper<LayoutNode, TValue>
  
  /**
   * Informs the graph that the specified [IMapper] is no longer needed.
   * @param [TValue] The type of the values associated with the edges.
   * @param [map] The [IMapper] to be disposed of.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-disposeEdgeDataMap">Online Documentation</a>
   */
  fun <TValue> disposeEdgeDataMap(
    map: IMapper<LayoutEdge, TValue>?,
  )
  
  /**
   * Informs the graph that the specified [IMapper] is no longer needed.
   * @param [TValue] The type of the values associated with the nodes.
   * @param [map] The [IMapper] to be disposed of.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-disposeNodeDataMap">Online Documentation</a>
   */
  fun <TValue> disposeNodeDataMap(
    map: IMapper<LayoutNode, TValue>?,
  )
  
  /**
   * Returns the bounds of the graph, optionally considering the specified nodes and edges, including node labels, edge labels, or node margins.
   * @param [nodes] The nodes whose geometry contributes to the bounds. If `null` or omitted, all nodes of the graph will be considered.
   * @param [edges] The edges whose geometry contributes to the bounds. If `null` or omitted, all edges of the graph will be considered.
   * @param [includeNodeLabels] A flag indicating whether to include node labels in the bounds calculation.
   * @param [includeEdgeLabels] A flag indicating whether to include edge labels in the bounds calculation.
   * @param [includeMargins] A flag indicating whether to include node margins in the bounds calculation.
   * @return The calculated bounds of the specified nodes and edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getBounds">Online Documentation</a>
   */
  fun getBounds(
    nodes: IEnumerable<LayoutNode>  = definedExternally,
    edges: IEnumerable<LayoutEdge>  = definedExternally,
    includeNodeLabels: Boolean  = definedExternally,
    includeEdgeLabels: Boolean  = definedExternally,
    includeMargins: Boolean  = definedExternally,
  ): Rect
  
  /**
   * Returns the children of the specified group node.
   * @param [node] The group node for which to return the children, or `null` if top-level nodes should be returned.
   * @return An enumerable collection of nodes that have `node` as their parent.
   * @throws ArgumentError Thrown if `node` is not part of this graph.
   * @see [LayoutGraphGrouping.getDescendants]
   * @see [setParent]
   * @see [getParent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getChildren">Online Documentation</a>
   */
  fun getChildren(
    node: LayoutNode?,
  ): ILinkedItemEnumerable<LayoutNode>
  
  /**
   * Returns the edges between the specified source and target nodes.
   * @param [source] The node from which the edges start.
   * @param [target] The node at which the edges end.
   * @param [directed] Specifies whether to return only directed edges (default) or all edges regardless of direction.
   * @return An enumerable collection of edges connecting the `source` to the `target`.
   * @throws ArgumentError Thrown if either `source` or `target` is not contained in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getEdgesBetween">Online Documentation</a>
   */
  fun getEdgesBetween(
    source: LayoutNode,
    target: LayoutNode,
    directed: Boolean  = definedExternally,
  ): IEnumerable<LayoutEdge>
  
  /**
   * Returns the parent node of a specified node, or `null` if the node is a top-level node.
   * @param [node] The node for which to obtain the parent node.
   * @return The parent node in this hierarchy, or `null` if `node` is a top-level node.
   * @throws ArgumentError Thrown if `node` is not part of this graph.
   * @see [setParent]
   * @see [getChildren]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-getParent">Online Documentation</a>
   */
  fun getParent(
    node: LayoutNode,
  ): LayoutNode?
  
  /**
   * Determines whether the specified node is a group node.
   * @param [node] The node to check for group status.
   * @return `true` if the node is considered a group node; otherwise, `false`.
   * @throws ArgumentError Thrown if `node` is not part of this graph.
   * @see [getChildren]
   * @see [setIsGroupNode]
   * @see [createGroupNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-isGroupNode">Online Documentation</a>
   */
  fun isGroupNode(
    node: LayoutNode?,
  ): Boolean
  
  /**
   * Reinserts a previously removed node back into this graph.
   * @param [node] The node to be reinserted.
   * @throws ArgumentError Thrown if `node` is already present in the graph.
   * @see [remove]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-reinsert(LayoutNode)">Online Documentation</a>
   */
  fun reinsert(
    node: LayoutNode,
  )
  
  /**
   * Reinserts a previously removed edge back into this graph.
   * @param [edge] The edge to be reinserted.
   * @throws ArgumentError Thrown if `edge` is already present in a graph, or if either the source or target of `edge` is not present in this graph.
   * @see [remove]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-reinsert(LayoutEdge)">Online Documentation</a>
   */
  fun reinsert(
    edge: LayoutEdge,
  )
  
  /**
   * Removes the specified edge from this graph.
   * @param [edge] The edge to be removed.
   * @throws ArgumentError Thrown if `edge` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutEdge)">Online Documentation</a>
   */
  fun remove(
    edge: LayoutEdge,
  )
  
  /**
   * Removes the specified edge from this graph.
   * @param [edge] The edge to be removed.
   * @throws ArgumentError Thrown if `edge` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutEdge)">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    edge: LayoutEdge,
  )
  
  /**
   * Removes the specified node from this graph.
   * @param [node] The node to be removed.
   * @throws ArgumentError Thrown if `node` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutNode)">Online Documentation</a>
   */
  fun remove(
    node: LayoutNode,
  )
  
  /**
   * Removes the specified node from this graph.
   * @param [node] The node to be removed.
   * @throws ArgumentError Thrown if `node` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutNode)">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    node: LayoutNode,
  )
  
  /**
   * Removes the given `bend` from the edge it belongs to and thus from this graph.
   * @param [bend] The bend to remove.
   * @throws ArgumentError `bend` is not in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutBend)">Online Documentation</a>
   */
  fun remove(
    bend: LayoutBend,
  )
  
  /**
   * Removes the given `bend` from the edge it belongs to and thus from this graph.
   * @param [bend] The bend to remove.
   * @throws ArgumentError `bend` is not in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutBend)">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    bend: LayoutBend,
  )
  
  /**
   * Removes the given `label` from its node.
   * @param [label] The label to remove.
   * @throws ArgumentError Thrown if `label` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutNodeLabel)">Online Documentation</a>
   */
  fun remove(
    label: LayoutNodeLabel,
  )
  
  /**
   * Removes the given `label` from its node.
   * @param [label] The label to remove.
   * @throws ArgumentError Thrown if `label` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutNodeLabel)">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    label: LayoutNodeLabel,
  )
  
  /**
   * Removes the given `label` from its edge.
   * @param [label] The label to remove.
   * @throws ArgumentError Thrown if `label` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutEdgeLabel)">Online Documentation</a>
   */
  fun remove(
    label: LayoutEdgeLabel,
  )
  
  /**
   * Removes the given `label` from its edge.
   * @param [label] The label to remove.
   * @throws ArgumentError Thrown if `label` is not present in this graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-remove(LayoutEdgeLabel)">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    label: LayoutEdgeLabel,
  )
  
  /**
   * Reverses the specified edge.
   * @param [edge] The edge to be reversed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-reverseEdge">Online Documentation</a>
   */
  fun reverseEdge(
    edge: LayoutEdge,
  )
  
  /**
   * Updates the group node status of a specified node.
   * @param [node] The node for which to set the group node status.
   * @param [isGroup] A boolean indicating whether to make the node a group node (`true`) or not (`false`).
   * @throws ArgumentError Thrown if `node` is not part of this graph or if `node` still has child nodes
   * @see [getChildren]
   * @see [isGroupNode]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setIsGroupNode">Online Documentation</a>
   */
  fun setIsGroupNode(
    node: LayoutNode,
    isGroup: Boolean,
  )
  
  /**
   * Sets the parent node for a specified node.
   * @param [node] The node to which a new parent will be assigned.
   * @param [parent] The parent group node to be assigned to `node`, or `null` to make `node` a top-level node.
   * @throws ArgumentError Thrown if `node` or `parent` are not part of this graph.
   * @throws InvalidOperationError Thrown if the `parent` is a descendant of `node` or the `node` itself.
   * @see [getParent]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-setParent">Online Documentation</a>
   */
  fun setParent(
    node: LayoutNode,
    parent: LayoutNode?,
  )
  
  /**
   * Sorts the list of [LayoutEdge] objects in this graph.
   * @param [comparator] A comparison delegate that defines the criteria for sorting the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-sortEdges(system.Comparison1)">Online Documentation</a>
   */
  fun sortEdges(
    comparator: Comparison1<LayoutEdge>,
  )
  
  /**
   * Sorts incoming and outgoing edges at each node of the graph.
   * @param [inEdgeComparator] The comparison function used for sorting the incoming edges at each node. Set to `null` to skip sorting incoming edges.
   * @param [outEdgeComparator] The comparison function used for sorting the outgoing edges at each node. Set to `null` to skip sorting outgoing edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-sortEdges(system.Comparison1,system.Comparison1)">Online Documentation</a>
   */
  fun sortEdges(
    inEdgeComparator: Comparison1<LayoutEdge>?,
    outEdgeComparator: Comparison1<LayoutEdge>?,
  )
  
  /**
   * Sorts the list of [LayoutNode] objects in this graph.
   * @param [comparator] A comparison delegate that defines the criteria for sorting the nodes.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-sortNodes">Online Documentation</a>
   */
  fun sortNodes(
    comparator: Comparison1<LayoutNode>,
  )
  
  companion object : ClassMetadata<LayoutGraph> {
    /**
     * Creates a new [LayoutGraph] as a (partial) copy of the specified graph.
     * @receiver The graph to be (partially) copied.
     * @param [subNodes] Optional subset of the nodes in the `graph` to be copied. If omitted, all nodes will be copied.
     * @param [subEdges] Optional subset of the edges in the `graph` to be copied. If omitted, all edges for which the adjacent nodes have been copied will be included.
     * @param [structureGraph] Specifies whether the created graph should only represent a plain graph structure without layout information for its nodes and edges, similar to graphs created with [createStructureGraph][LayoutGraph].
     * @return A new [LayoutGraph] instance that is a (partial) copy of the specified graph.
     * @see [LayoutGraphCopyData]
     * @see [LayoutGraphContext.graphCopyData]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createCopy">Online Documentation</a>
     */
    fun LayoutGraph.createCopy(
      subNodes: IEnumerable<LayoutNode>  = definedExternally,
      subEdges: IEnumerable<LayoutEdge>  = definedExternally,
      structureGraph: Boolean  = definedExternally,
    ): LayoutGraph
    
    /**
     * Creates a graph that represents a plain graph structure without layout information for its nodes and edges.
     * @return A new [LayoutGraph] instance representing a plain graph structure without layout information.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LayoutGraph%23LayoutGraph-method-createStructureGraph">Online Documentation</a>
     */
    fun createStructureGraph(): LayoutGraph
  }
}

inline val  LayoutGraph.isNotEmpty: Boolean
    get() = !isEmpty
