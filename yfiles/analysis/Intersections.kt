// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.graph.GraphItemTypes
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.IModelItem
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject
import yfiles.layout.IntersectionItemTypes
import yfiles.layout.ItemCollection

/**
 * Finds all intersections between nodes, edges and labels.
 * @see [IntersectionAlgorithm.findIntersections][yfiles.algorithms.IntersectionAlgorithm.findIntersections]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections">Online Documentation</a>
 * 
 * @constructor Creates a new [Intersections] instance with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23Intersections-constructor-Intersections">Online Documentation</a>
 */
external open class Intersections  () : YObject {

/**
 * Gets or sets the graph items that must be involved in each intersection.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23affectedItems">Online Documentation</a>
 */
final var affectedItems: ItemCollection<IModelItem>
/**
 * Gets or sets whether the intersections are based on the actual geometry of the items defined by their visualization or by simplified rectangular bounds for nodes, oriented rectangular bounds for labels and line segments for edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23considerItemGeometry">Online Documentation</a>
 */
final var considerItemGeometry: Boolean
/**
 * Gets or sets the graph item types that are taken into consideration when calculating the intersections.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23consideredItemTypes">Online Documentation</a>
 */
final var consideredItemTypes: IntersectionItemTypes
/**
 * Gets or sets the type of items that are considered independently of their owning element when calculating the [IntersectionsResult].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23independentItems">Online Documentation</a>
 */
final var independentItems: GraphItemTypes
/**
 * Gets or sets the collection of [edges][IEdge] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23subgraphEdges">Online Documentation</a>
 */
final var subgraphEdges: ItemCollection<IEdge>
/**
 * Gets or sets the collection of [nodes][INode] which define a subset of the graph for the algorithms to work on.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23subgraphNodes">Online Documentation</a>
 */
final var subgraphNodes: ItemCollection<INode>
/**
 * Calculates intersections between the items for the given graph.
 * @param [graph] The input graph to run the algorithm on.
 * @return A [IntersectionsResult] containing the intersections.
 * @throws InvalidOperationError If the algorithm can't create a valid result due to an invalid graph structure or wrongly configured properties.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Intersections%23Intersections-method-run">Online Documentation</a>
 */
 final   fun run( graph: IGraph ):IntersectionsResult

companion object : ClassMetadata<Intersections> {
}
}

inline fun Intersections(
    block: Intersections.() -> Unit
): Intersections {
    return Intersections()
        .apply(block)
}
