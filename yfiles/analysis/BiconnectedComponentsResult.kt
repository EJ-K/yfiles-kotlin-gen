// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.IEdge
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents the biconnected components of a graph, as computed by [BiconnectedComponents].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentsResult">Online Documentation</a>
 */
external  class BiconnectedComponentsResult  : YObject {

/**
 * Gets a collection of all articulation points in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentsResult%23articulationNodes">Online Documentation</a>
 */
final var articulationNodes: ResultItemCollection<INode>
/**
 * Gets a collection of all biconnected components in the graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentsResult%23components">Online Documentation</a>
 */
final var components: ResultItemCollection<BiconnectedComponent>
/**
 * Gets a map which returns for each edge the ID of the component the edge belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentsResult%23edgeComponentIds">Online Documentation</a>
 */
final var edgeComponentIds: ResultItemMapping<IEdge, Int>
/**
 * Gets a map which returns for each edge the [component][BiconnectedComponent] the edge belongs to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentsResult%23edgeComponents">Online Documentation</a>
 */
final var edgeComponents: ResultItemMapping<IEdge, BiconnectedComponent>
/**
 * Gets a collection of all biconnected components which contain the given `node`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentsResult%23BiconnectedComponentsResult-method-getNodeComponents">Online Documentation</a>
 */
 final   fun getNodeComponents( node: INode ):ResultItemCollection<BiconnectedComponent>
/**
 * Whether the given node is an articulation point.
 * @param [node] The node to test.
 * @return `true` if the node is an articulation point, `false` otherwise.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BiconnectedComponentsResult%23BiconnectedComponentsResult-method-isArticulationNode">Online Documentation</a>
 */
 final   fun isArticulationNode( node: INode ):Boolean

companion object : ClassMetadata<BiconnectedComponentsResult> {
}
}
