// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.ILayoutAlgorithm
import yfiles.layout.ILayoutStage
import yfiles.layout.LayoutGraph

/**
 * This layout algorithm removes overlaps between nodes in a graph.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout">Online Documentation</a>
 * 
 * @constructor Creates a new instance of [ShuffleLayout] with default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23ShuffleLayout-constructor-ShuffleLayout">Online Documentation</a>
 */
external open class ShuffleLayout  () : ILayoutStage {

/**
 * Gets or sets whether or not the barycenter mode is used for node shuffling when removing overlaps.
 * 
 * Default value - `false`. The barycenter mode is disabled.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23barycenterMode">Online Documentation</a>
 */
open var barycenterMode: Boolean
/**
 * Gets or sets the core layout algorithm.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23coreLayout">Online Documentation</a>
 */
override var coreLayout: ILayoutAlgorithm?
/**
 * Gets or sets the criterion for marking an overlap as horizontal.
 * 
 * Default value - [HorizontalOverlapCriterion.LESS_MOVEMENT]
 * @throws ArgumentError if the given criterion is unknown
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23horizontalOverlapCriterion">Online Documentation</a>
 */
open var horizontalOverlapCriterion: HorizontalOverlapCriterion
/**
 * Gets or sets the default minimum distance that has to be obeyed between any two nodes.
 * 
 * Default value - `5`
 * @throws ArgumentError if the given distance is negative
 * @see [MINIMUM_DISTANCE_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23minimumNodeDistance">Online Documentation</a>
 */
open var minimumNodeDistance: Double
/**
 * Gets or sets whether or not the simple, fast layout mode of this algorithm is active.
 * 
 * Default value - `false`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23simpleMode">Online Documentation</a>
 */
open var simpleMode: Boolean
/**
 * Performs the overlap removal (shuffle) algorithm on the given graph, after the [core layout algorithm][coreLayout] was applied to it.
 * @param [graph] the input graph
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23ShuffleLayout-method-applyLayout">Online Documentation</a>
 */
 override   fun applyLayout( graph: LayoutGraph )

companion object : ClassMetadata<ShuffleLayout> {
/**
 * A data provider key for marking nodes as fixed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23FIXED_NODE_DP_KEY">Online Documentation</a>
 */
 val FIXED_NODE_DP_KEY: NodeDpKey<Boolean>
/**
 * A data provider key for specifying a minimum distance for each node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShuffleLayout%23MINIMUM_DISTANCE_DP_KEY">Online Documentation</a>
 */
 val MINIMUM_DISTANCE_DP_KEY: NodeDpKey<Double>
}
}

inline fun ShuffleLayout(
    block: ShuffleLayout.() -> Unit
): ShuffleLayout {
    return ShuffleLayout()
        .apply(block)
}
