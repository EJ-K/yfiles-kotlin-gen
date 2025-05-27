// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.YFlags

/**
 * The side placement specifier for edge labels used by [EdgeSegmentLabelModel].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSides">Online Documentation</a>
 */
external class EdgeSides 
    private constructor(): YFlags<EdgeSides> {
    companion object {
    /**
 * The label should be placed on the path of the edge.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSides%23ON_EDGE">Online Documentation</a>
 */
val ON_EDGE: EdgeSides
/**
 * The label should be placed on the left hand side of the edge path if looking from the source node into the direction of the target node.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSides%23LEFT_OF_EDGE">Online Documentation</a>
 */
val LEFT_OF_EDGE: EdgeSides
/**
 * The label should be placed on the right hand side of the edge path if looking from the source node into the direction of the target node.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSides%23RIGHT_OF_EDGE">Online Documentation</a>
 */
val RIGHT_OF_EDGE: EdgeSides
/**
 * The label should be placed above the edge (in geometric sense).
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSides%23ABOVE_EDGE">Online Documentation</a>
 */
val ABOVE_EDGE: EdgeSides
/**
 * The label should be placed below the edge (in geometric sense).
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/EdgeSides%23BELOW_EDGE">Online Documentation</a>
 */
val BELOW_EDGE: EdgeSides

    }
}
