// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.YFlags

/**
 * Graph item types for the intersection algorithm [IntersectionAlgorithm.findIntersections][yfiles.algorithms.IntersectionAlgorithm.findIntersections].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionItemTypes">Online Documentation</a>
 */
external class IntersectionItemTypes 
    private constructor(): YFlags<IntersectionItemTypes> {
    companion object {
    /**
 * A graph item type that indicates that nodes are taken in consideration for intersection calculation.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionItemTypes%23NODE">Online Documentation</a>
 */
val NODE: IntersectionItemTypes
/**
 * A graph item type that indicates that edges are taken in consideration for intersection calculation.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionItemTypes%23EDGE">Online Documentation</a>
 */
val EDGE: IntersectionItemTypes
/**
 * A graph item type that indicates that node labels are taken in consideration for intersection calculation.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionItemTypes%23NODE_LABEL">Online Documentation</a>
 */
val NODE_LABEL: IntersectionItemTypes
/**
 * A graph item type that indicates that edge labels are taken in consideration for intersection calculation.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionItemTypes%23EDGE_LABEL">Online Documentation</a>
 */
val EDGE_LABEL: IntersectionItemTypes
/**
 * A graph item type that indicates that all labels are taken in consideration for intersection calculation.
 * 
 * Value - `12`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionItemTypes%23LABEL">Online Documentation</a>
 */
val LABEL: IntersectionItemTypes
/**
 * A graph item type that indicates that all items are taken in consideration for intersection calculation.
 * 
 * Value - `15`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IntersectionItemTypes%23ALL">Online Documentation</a>
 */
val ALL: IntersectionItemTypes

    }
}
