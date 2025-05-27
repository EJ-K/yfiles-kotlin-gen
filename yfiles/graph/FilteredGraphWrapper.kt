// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.geometry.Rect
import yfiles.lang.ClassMetadata
import yfiles.lang.Predicate
import yfiles.styles.INodeStyle

/**
 * An [IGraph] that contains a live subgraph of another [IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper">Online Documentation</a>
 * 
 * @constructor Creates a new graph instance that wraps the original graph and uses the predicates to determine which nodes and edges should be contained in the graph.
 * @param [graph] The graph to wrap
 * @param [nodePredicate] The predicate that determines which nodes to keep.
 * @param [edgePredicate] The optional predicate that determines which edges to keep. If omitted, all edges are kept, unless connected to filtered nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-constructor-FilteredGraphWrapper">Online Documentation</a>
 * 
 * @property nodePredicate
 * Gets or sets the predicate function for the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23nodePredicate">Online Documentation</a>
 * 
 * @property edgePredicate
 * Gets or sets the predicate function for the edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23edgePredicate">Online Documentation</a>
 */
external class FilteredGraphWrapper (
graph: IGraph,
final var nodePredicate: Predicate<INode>,
final var edgePredicate: Predicate<IEdge> = definedExternally) : GraphWrapperBase {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23edges">Online Documentation</a>
   */
  final override val edges: IListEnumerable<IEdge>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23labels">Online Documentation</a>
   */
  final override val labels: IListEnumerable<ILabel>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23nodes">Online Documentation</a>
   */
  final override val nodes: IListEnumerable<INode>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23ports">Online Documentation</a>
   */
  final override val ports: IListEnumerable<IPort>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-addEventHandlers">Online Documentation</a>
   */
  override fun addEventHandlers(
    graph: IGraph,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-contains">Online Documentation</a>
   */
  override operator fun contains(
    item: IModelItem,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-createGroupNode">Online Documentation</a>
   */
  override fun createGroupNode(
    parent: INode?,
    layout: Rect,
    style: INodeStyle,
    tag: Tag?,
  ): INode
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-createNode">Online Documentation</a>
   */
  override fun createNode(
    parent: INode?,
    layout: Rect,
    style: INodeStyle,
    tag: Tag?,
  ): INode
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-dispose">Online Documentation</a>
   */
  override fun dispose()
  
  /**
   * Should be called by the client if the [edgePredicate][FilteredGraphWrapper] changed for the edge in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-edgePredicateChanged()">Online Documentation</a>
   */
  fun edgePredicateChanged()
  
  /**
   * Should be called by the client when the [edgePredicate][FilteredGraphWrapper] has changed for the specified edge.
   * @param [edge] The edge for which the [edgePredicate][FilteredGraphWrapper] has changed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-edgePredicateChanged(IEdge)">Online Documentation</a>
   */
  fun edgePredicateChanged(
    edge: IEdge,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-edgesAt">Online Documentation</a>
   */
  override fun edgesAt(
    port: IPort,
    type: AdjacencyTypes,
  ): IListEnumerable<IEdge>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-edgesAt">Online Documentation</a>
   */
  override fun edgesAt(
    owner: IPortOwner,
    type: AdjacencyTypes,
  ): IListEnumerable<IEdge>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-getChildren">Online Documentation</a>
   */
  override fun getChildren(
    node: INode?,
  ): IListEnumerable<INode>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-getParent">Online Documentation</a>
   */
  override fun getParent(
    node: INode,
  ): INode?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-isGroupNode">Online Documentation</a>
   */
  override fun isGroupNode(
    node: INode,
  ): Boolean
  
  /**
   * Should be called by the client if the [nodePredicate][FilteredGraphWrapper] changed for the nodes in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-nodePredicateChanged()">Online Documentation</a>
   */
  fun nodePredicateChanged()
  
  /**
   * Should be called by the client when the [nodePredicate][FilteredGraphWrapper] has changed for the specified node.
   * @param [node] The node for which the [nodePredicate][FilteredGraphWrapper] has changed.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-nodePredicateChanged(INode)">Online Documentation</a>
   */
  fun nodePredicateChanged(
    node: INode,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-onGraphChanged">Online Documentation</a>
   */
  override fun onGraphChanged(
    oldGraph: IGraph?,
    newGraph: IGraph?,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-onNodeRemoved">Online Documentation</a>
   */
  override fun onNodeRemoved(
    event: NodeEventArgs,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-removeEventHandlers">Online Documentation</a>
   */
  override fun removeEventHandlers(
    graph: IGraph,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-setIsGroupNode">Online Documentation</a>
   */
  override fun setIsGroupNode(
    node: INode,
    isGroupNode: Boolean,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/FilteredGraphWrapper%23FilteredGraphWrapper-method-setParent">Online Documentation</a>
   */
  override fun setParent(
    node: INode,
    parent: INode?,
  )
  
  companion object : ClassMetadata<FilteredGraphWrapper> {
  }
}
