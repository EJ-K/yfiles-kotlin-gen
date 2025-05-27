// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * A direction constant that describes that the last connector segment points up.
 * @see [SubtreeShape.connectorDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectorDirection">Online Documentation</a>
 */
external sealed class ConnectorDirection: YEnum<ConnectorDirection> {
   companion object: EnumMetadata<ConnectorDirection> {
       /**
 * A direction constant that describes that the last connector segment points up.
 * 
 * Value - `1`
 * @see [SubtreeShape.connectorDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectorDirection%23NORTH">Online Documentation</a>
 */
val NORTH: ConnectorDirection

/**
 * A direction constant that describes that the last connector segment points to the right.
 * 
 * Value - `2`
 * @see [SubtreeShape.connectorDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectorDirection%23EAST">Online Documentation</a>
 */
val EAST: ConnectorDirection

/**
 * A direction constant that describes that the last connector segment points down.
 * 
 * Value - `4`
 * @see [SubtreeShape.connectorDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectorDirection%23SOUTH">Online Documentation</a>
 */
val SOUTH: ConnectorDirection

/**
 * A direction constant that describes that the last connector segment points to the left.
 * 
 * Value - `8`
 * @see [SubtreeShape.connectorDirection]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ConnectorDirection%23WEST">Online Documentation</a>
 */
val WEST: ConnectorDirection
   }
}
