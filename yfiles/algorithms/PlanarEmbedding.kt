// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import js.array.ReadonlyArray
import yfiles.collections.IList
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Represents an embedding of a planar graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding">Online Documentation</a>
 * 
 * @constructor Creates a new embedding for the specified planar graph.
 * @param [graph] a planar graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23PlanarEmbedding-constructor-PlanarEmbedding">Online Documentation</a>
 */
external  class PlanarEmbedding  ( graph: Graph ) : YObject {

/**
 * Gets a [IList] of face lists.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23faces">Online Documentation</a>
 */
final val faces: IList<out IList<out Dart>>
/**
 * Gets the [IList] that represents the outer face.
 * @see [faces]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23outerFace">Online Documentation</a>
 */
final val outerFace: IList<out Dart>
/**
 * Returns the cyclic next dart of the given dart.
 * @param [dart] a dart
 * @return the cyclic next dart of the given dart
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23PlanarEmbedding-method-getCyclicNext">Online Documentation</a>
 */
 final   fun getCyclicNext( dart: Dart ):Dart
/**
 * Returns the cyclic previous dart of the given dart.
 * @param [dart] a dart
 * @return the cyclic previous dart of the given dart
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23PlanarEmbedding-method-getCyclicPrevious">Online Documentation</a>
 */
 final   fun getCyclicPrevious( dart: Dart ):Dart
/**
 * Returns the two darts associated with the given edge.
 * @param [edge] an edge
 * @return the two darts associated with the given edge
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23PlanarEmbedding-method-getDarts">Online Documentation</a>
 */
 final   fun getDarts( edge: Edge ):ReadonlyArray<Dart>
/**
 * Returns a [IList] containing the (cyclic ordered) outgoing darts of the specified node.
 * @param [node] a node
 * @return a [IList] containing the (cyclic ordered) outgoing darts
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23PlanarEmbedding-method-getOutgoingDarts">Online Documentation</a>
 */
 final   fun getOutgoingDarts( node: Node ):IList<out Dart>

companion object : ClassMetadata<PlanarEmbedding> {
/**
 * Return whether or not the given graph is planar.
 * @receiver the input graph
 * @return `true` if the given graph is planar, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PlanarEmbedding%23PlanarEmbedding-method-isPlanar">Online Documentation</a>
 */
 final   fun Graph.isPlanar():Boolean
}
}
