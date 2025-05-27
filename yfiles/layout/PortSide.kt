// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.layout

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [PortConstraint.create]
 * @see [PortConstraint.side]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortSide">Online Documentation</a>
 */
external sealed class PortSide: YEnum<PortSide> {
   companion object: EnumMetadata<PortSide> {
       /**
 * A weak constraint indicating that edges can connect to any side of a node.
 * 
 * Value - `0`
 * @see [PortConstraint.create]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortSide%23ANY">Online Documentation</a>
 */
val ANY: PortSide

/**
 * A weak constraint indicating that edges can connect to the north side (top side) of a node.
 * 
 * Value - `1`
 * @see [PortConstraint.create]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortSide%23NORTH">Online Documentation</a>
 */
val NORTH: PortSide

/**
 * A weak constraint indicating that edges can connect to the south side (bottom side) of a node.
 * 
 * Value - `2`
 * @see [PortConstraint.create]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortSide%23SOUTH">Online Documentation</a>
 */
val SOUTH: PortSide

/**
 * A weak constraint indicating that edges can connect to the east side (right side) of a node.
 * 
 * Value - `4`
 * @see [PortConstraint.create]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortSide%23EAST">Online Documentation</a>
 */
val EAST: PortSide

/**
 * A weak constraint indicating that edges can connect to the west side (left side) of a node.
 * 
 * Value - `8`
 * @see [PortConstraint.create]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortSide%23WEST">Online Documentation</a>
 */
val WEST: PortSide
   }
}
