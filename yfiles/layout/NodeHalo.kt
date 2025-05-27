// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.algorithms.YRectangle
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A [NodeHalo] specifies a rectangular area around a specific node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo">Online Documentation</a>
 */
external  class NodeHalo  : YObject {

/**
 * The [NodeHalo] size at the bottom side of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23bottom">Online Documentation</a>
 */
final val bottom: Double
/**
 * The [NodeHalo] size at the left side of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23left">Online Documentation</a>
 */
final val left: Double
/**
 * The [NodeHalo] size at the right side of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23right">Online Documentation</a>
 */
final val right: Double
/**
 * The [NodeHalo] size at the top side of the node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23top">Online Documentation</a>
 */
final val top: Double

companion object : ClassMetadata<NodeHalo> {
/**
 * A data provider key for assigning halos for the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23NODE_HALO_DP_KEY">Online Documentation</a>
 */
 val NODE_HALO_DP_KEY: NodeDpKey<NodeHalo>
/**
 * A constant holding a [NodeHalo] with zero size on each side.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23ZERO_HALO">Online Documentation</a>
 */
 val ZERO_HALO: NodeHalo
/**
 * Creates a [NodeHalo] object with the specified value on each side of the node.
 * @param [value] the halo size at each side of the node
 * @return the newly created [NodeHalo]
 * @throws ArgumentError if the value is negative, [Double.NaN] or [Double.POSITIVE_INFINITY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23NodeHalo-method-create(number)">Online Documentation</a>
 */
@JsName("create")
 final  operator fun invoke( value: Double ):NodeHalo
/**
 * Creates a [NodeHalo] with the specified values.
 * @param [top] the [NodeHalo] size at the top side of the node
 * @param [left] the [NodeHalo] size at the left side of the node
 * @param [bottom] the [NodeHalo] size at the bottom side of the node
 * @param [right] the [NodeHalo] size at the right side of the node
 * @return the newly created [NodeHalo]
 * @throws ArgumentError if one of the values is negative, [Double.NaN] or [Double.POSITIVE_INFINITY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23NodeHalo-method-create(number,number,number,number)">Online Documentation</a>
 */
@JsName("create")
 final  operator fun invoke( top: Double ,
 left: Double ,
 bottom: Double ,
 right: Double ):NodeHalo
/**
 * Returns the [NodeHalo] associated with the given node.
 * @receiver the graph containing the given node
 * @param [node] the node whose [NodeHalo] will be determined
 * @return the [NodeHalo] of the given node if available, otherwise a [ZERO_HALO]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23NodeHalo-method-getHalo">Online Documentation</a>
 */
 final   fun LayoutGraph.getHalo( node: Node ):NodeHalo
/**
 * Returns a [YRectangle] instance with the bounds of the given node including its [NodeHalo].
 * @receiver the graph containing the given node
 * @param [node] the node whose [NodeHalo] will be determined
 * @return a [YRectangle] instance with the bounds of the given node including its [NodeHalo]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23NodeHalo-method-getHaloBox">Online Documentation</a>
 */
 final   fun LayoutGraph.getHaloBox( node: Node ):YRectangle
/**
 * Checks whether or not the given graph contains [NodeHalo] information.
 * @receiver the input graph
 * @return `true` if a [IDataProvider][yfiles.algorithms.IDataProvider] has been registered with the according key, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeHalo%23NodeHalo-method-hasHalos">Online Documentation</a>
 */
 final   fun LayoutGraph.hasHalos():Boolean
}
}
