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
 * @see [DiscreteNodeLabelLayoutModel]
 * @see [DiscreteNodeLabelLayoutModel.candidateMask]
 * @see [DiscreteNodeLabelLayoutModel.getLabelPlacementForPosition]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions">Online Documentation</a>
 */
external class DiscreteNodeLabelPositions 
    private constructor(): YFlags<DiscreteNodeLabelPositions> {
    companion object {
    /**
 * Position specifier that describes a label placement north of the node.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23NORTH">Online Documentation</a>
 */
val NORTH: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement north-west of the node.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23NORTH_WEST">Online Documentation</a>
 */
val NORTH_WEST: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement north-east of the node.
 * 
 * Value - `4`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23NORTH_EAST">Online Documentation</a>
 */
val NORTH_EAST: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement east of the node.
 * 
 * Value - `8`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23EAST">Online Documentation</a>
 */
val EAST: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement west of the node.
 * 
 * Value - `16`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23WEST">Online Documentation</a>
 */
val WEST: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement south of the node.
 * 
 * Value - `32`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23SOUTH">Online Documentation</a>
 */
val SOUTH: DiscreteNodeLabelPositions
/**
 * Position mask that constrains the positions to [above][NORTH] and [below][SOUTH] the node.
 * 
 * Value - `33`
 * @see [NORTH]
 * @see [SOUTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23SANDWICH_MASK">Online Documentation</a>
 */
val SANDWICH_MASK: DiscreteNodeLabelPositions
/**
 * Position mask that constrains the positions to the node's four sides.
 * 
 * Value - `57`
 * @see [EAST]
 * @see [WEST]
 * @see [NORTH]
 * @see [SOUTH]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23SIDES_MASK">Online Documentation</a>
 */
val SIDES_MASK: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement south-west of the node.
 * 
 * Value - `64`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23SOUTH_WEST">Online Documentation</a>
 */
val SOUTH_WEST: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement south-east of the node.
 * 
 * Value - `128`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23SOUTH_EAST">Online Documentation</a>
 */
val SOUTH_EAST: DiscreteNodeLabelPositions
/**
 * Position mask that constrains the positions to the corners outside the node.
 * 
 * Value - `198`
 * @see [NORTH_EAST]
 * @see [NORTH_WEST]
 * @see [SOUTH_EAST]
 * @see [SOUTH_WEST]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23CORNER_MASK">Online Documentation</a>
 */
val CORNER_MASK: DiscreteNodeLabelPositions
/**
 * Position mask that constraints the positions to the eight node-external positions.
 * 
 * Value - `255`
 * @see [NORTH]
 * @see [EAST]
 * @see [SOUTH]
 * @see [WEST]
 * @see [NORTH_EAST]
 * @see [NORTH_WEST]
 * @see [SOUTH_EAST]
 * @see [SOUTH_WEST]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23EIGHT_POS_MASK">Online Documentation</a>
 */
val EIGHT_POS_MASK: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the center of the node.
 * 
 * Value - `256`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23CENTER">Online Documentation</a>
 */
val CENTER: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the bottom inside the node.
 * 
 * Value - `512`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23BOTTOM">Online Documentation</a>
 */
val BOTTOM: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the top inside the node.
 * 
 * Value - `1024`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23TOP">Online Documentation</a>
 */
val TOP: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the left inside the node.
 * 
 * Value - `2048`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23LEFT">Online Documentation</a>
 */
val LEFT: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the right inside the node.
 * 
 * Value - `4096`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23RIGHT">Online Documentation</a>
 */
val RIGHT: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the top-left inside the node.
 * 
 * Value - `8192`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23TOP_LEFT">Online Documentation</a>
 */
val TOP_LEFT: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the top-right inside the node.
 * 
 * Value - `16384`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23TOP_RIGHT">Online Documentation</a>
 */
val TOP_RIGHT: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the bottom-left inside the node.
 * 
 * Value - `32768`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23BOTTOM_LEFT">Online Documentation</a>
 */
val BOTTOM_LEFT: DiscreteNodeLabelPositions
/**
 * Position specifier that describes a label placement at the bottom-right inside the node.
 * 
 * Value - `65536`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23BOTTOM_RIGHT">Online Documentation</a>
 */
val BOTTOM_RIGHT: DiscreteNodeLabelPositions
/**
 * Position mask that constrains the positions to the nine node-internal positions.
 * 
 * Value - `130816`
 * @see [CENTER]
 * @see [TOP]
 * @see [BOTTOM]
 * @see [LEFT]
 * @see [RIGHT]
 * @see [TOP_LEFT]
 * @see [TOP_RIGHT]
 * @see [BOTTOM_LEFT]
 * @see [BOTTOM_RIGHT]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/DiscreteNodeLabelPositions%23INTERNAL_MASK">Online Documentation</a>
 */
val INTERNAL_MASK: DiscreteNodeLabelPositions

    }
}
