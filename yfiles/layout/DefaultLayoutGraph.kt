// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import js.array.ReadonlyArray
import yfiles.algorithms.Edge
import yfiles.algorithms.ICursor
import yfiles.algorithms.IEdgeMap
import yfiles.algorithms.INodeMap
import yfiles.algorithms.Node
import yfiles.collections.IMap
import yfiles.lang.ClassMetadata

/**
 * [DefaultLayoutGraph] is a default implementation of [LayoutGraph] which holds the complete layout information about the graph and its elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph">Online Documentation</a>
 * 
 * @constructor Creates a new [DefaultLayoutGraph] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-constructor-DefaultLayoutGraph()">Online Documentation</a>
 */
external open class DefaultLayoutGraph  () : LayoutGraph {
/**
 * Creates a new [DefaultLayoutGraph] instance which is a copy of the given graph.
 * @param [argGraph] the original graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-constructor-DefaultLayoutGraph(LayoutGraph)">Online Documentation</a>
 */
 constructor( argGraph: LayoutGraph )
/**
 * Creates a new [DefaultLayoutGraph] instance which is a copy of the given subgraph.
 * @param [graph] the original graph
 * @param [nodeSubset] the nodes that induce a subgraph of the original graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-constructor-DefaultLayoutGraph(LayoutGraph,ICursor)">Online Documentation</a>
 */
 constructor( graph: LayoutGraph ,
 nodeSubset: ICursor<Node> )

/**
 * A [IMap] associating the owner of an edge label with the edge label itself.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23edgeLabelFeatureMap">Online Documentation</a>
 */
protected final var edgeLabelFeatureMap: IMap<IEdgeLabelLayout, Edge>
/**
 * An [IEdgeMap] associating [IEdgeLabelLayout]s with the edges of this graph.
 * @see [setLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23edgeLabelMap">Online Documentation</a>
 */
protected final var edgeLabelMap: IEdgeMap<ReadonlyArray<IEdgeLabelLayout>>
/**
 * A [IMap] associating the owner of a node label with the node label itself.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23nodeLabelFeatureMap">Online Documentation</a>
 */
protected final var nodeLabelFeatureMap: IMap<INodeLabelLayout, Node>
/**
 * A [INodeMap] associating [INodeLabelLayout]s with the nodes of this graph.
 * @see [setLabelLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23nodeLabelMap">Online Documentation</a>
 */
protected final var nodeLabelMap: INodeMap<ReadonlyArray<INodeLabelLayout>>
/**
 * Creates a new implementation of [IEdgeLayout].
 * @return the layout of an edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-createEdgeLayout">Online Documentation</a>
 */
 open protected   fun createEdgeLayout():IEdgeLayout
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-createLabelFactory">Online Documentation</a>
 */
 override   fun createLabelFactory():ILabelLayoutFactory
/**
 * Creates a new implementation of [INodeLayout].
 * @return the layout of a node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-createNodeLayout">Online Documentation</a>
 */
 open protected   fun createNodeLayout():INodeLayout
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-getLabelLayout">Online Documentation</a>
 */
 override   fun getLabelLayout( node: Node ):ReadonlyArray<INodeLabelLayout>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-getLabelLayout">Online Documentation</a>
 */
 override   fun getLabelLayout( edge: Edge ):ReadonlyArray<IEdgeLabelLayout>
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-getLayout">Online Documentation</a>
 */
 override   fun getLayout( node: Node ):INodeLayout
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-getLayout">Online Documentation</a>
 */
 override   fun getLayout( edge: Edge ):IEdgeLayout
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-getOwnerEdge">Online Documentation</a>
 */
 override   fun getOwnerEdge( labelLayout: IEdgeLabelLayout ):Edge
/**
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-getOwnerNode">Online Documentation</a>
 */
 override   fun getOwnerNode( labelLayout: INodeLabelLayout ):Node
/**
 * Specifies the layout information for all associated labels of the given node in case there is only one label.
 * @param [node] the node
 * @param [layout] the layout information for the label of the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-setLabelLayout(Node,INodeLabelLayout)">Online Documentation</a>
 */
 open   fun setLabelLayout( node: Node ,
 layout: INodeLabelLayout )
/**
 * Specifies the layout information for all associated labels of the given node.
 * @param [node] the node
 * @param [layout] the layout information for the labels of the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-setLabelLayout(Node,INodeLabelLayout[])">Online Documentation</a>
 */
 open   fun setLabelLayout( node: Node ,
 layout: ReadonlyArray<INodeLabelLayout> )
/**
 * Specifies the layout information for all associated labels of the given edge.
 * @param [edge] the edge
 * @param [layout] the layout information for the labels of the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-setLabelLayout(Edge,IEdgeLabelLayout[])">Online Documentation</a>
 */
 open   fun setLabelLayout( edge: Edge ,
 layout: ReadonlyArray<IEdgeLabelLayout> )
/**
 * Specifies the layout information for the given node.
 * @param [node] the node
 * @param [layout] the layout information for the node
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-setLayout(Node,INodeLayout)">Online Documentation</a>
 */
 open   fun setLayout( node: Node ,
 layout: INodeLayout )
/**
 * Specifies the layout information for the given edge.
 * @param [edge] the edge
 * @param [layout] the layout information for the edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DefaultLayoutGraph%23DefaultLayoutGraph-method-setLayout(Edge,IEdgeLayout)">Online Documentation</a>
 */
 open   fun setLayout( edge: Edge ,
 layout: IEdgeLayout )

companion object : ClassMetadata<DefaultLayoutGraph> {
}
}

inline fun DefaultLayoutGraph(
    block: DefaultLayoutGraph.() -> Unit
): DefaultLayoutGraph {
    return DefaultLayoutGraph()
        .apply(block)
}
