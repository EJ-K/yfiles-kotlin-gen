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
 * @see [PreferredPlacementDescriptor.newSharedInstance]
 * @see [PreferredPlacementDescriptor.placeAlongEdge]
 * @see [PreferredPlacementDescriptor.sideOfEdge]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements">Online Documentation</a>
 */
external class LabelPlacements 
    private constructor(): YFlags<LabelPlacements> {
    companion object {
    /**
 * Preferred placement specifier for edge labels which expresses that the label should be placed on the right hand side of the edge path.
 * 
 * Value - `-128`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23RIGHT_OF_EDGE">Online Documentation</a>
 */
val RIGHT_OF_EDGE: LabelPlacements
/**
 * Placement specifier mask that masks all placement specifiers that describe the side of the edge.
 * 
 * Value - `-32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23ON_SIDE_OF_EDGE_MASK">Online Documentation</a>
 */
val ON_SIDE_OF_EDGE_MASK: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label can be placed anywhere along the edge or on any side of the edge.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23ANYWHERE">Online Documentation</a>
 */
val ANYWHERE: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label should be placed near the source node of an edge.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23AT_SOURCE">Online Documentation</a>
 */
val AT_SOURCE: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label should be placed near the target node of an edge.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23AT_TARGET">Online Documentation</a>
 */
val AT_TARGET: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label should be placed near the center of the edge path.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23AT_CENTER">Online Documentation</a>
 */
val AT_CENTER: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label should be placed directly at the source port of the edge.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23AT_SOURCE_PORT">Online Documentation</a>
 */
val AT_SOURCE_PORT: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label should be placed directly at the target port of the edge.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23AT_TARGET_PORT">Online Documentation</a>
 */
val AT_TARGET_PORT: LabelPlacements
/**
 * Placement specifier mask that masks all placement specifiers that describe the placement along the edge.
 * 
 * Value - `31`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23ALONG_EDGE_MASK">Online Documentation</a>
 */
val ALONG_EDGE_MASK: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label should be placed on the path of the edge.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23ON_EDGE">Online Documentation</a>
 */
val ON_EDGE: LabelPlacements
/**
 * Preferred placement specifier for edge labels which expresses that the label should be placed on the left hand side of the edge path.
 * 
 * Value - `64`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/LabelPlacements%23LEFT_OF_EDGE">Online Documentation</a>
 */
val LEFT_OF_EDGE: LabelPlacements

    }
}
