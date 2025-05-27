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
 * @see [ClassicTreeLayout.portStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyle">Online Documentation</a>
 */
external sealed class PortStyle: YEnum<PortStyle> {
   companion object: EnumMetadata<PortStyle> {
       /**
 * A constant defining that ports are placed at the center of the nodes.
 * 
 * Value - `0`
 * @see [ClassicTreeLayout.portStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyle%23NODE_CENTER">Online Documentation</a>
 */
val NODE_CENTER: PortStyle

/**
 * A constant defining that ports are placed at the center of the border of the nodes.
 * 
 * Value - `1`
 * @see [ClassicTreeLayout.portStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyle%23BORDER_CENTER">Online Documentation</a>
 */
val BORDER_CENTER: PortStyle

/**
 * A constant defining that ports are evenly distributed along the border of the nodes.
 * 
 * Value - `2`
 * @see [ClassicTreeLayout.portStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyle%23BORDER_DISTRIBUTED">Online Documentation</a>
 */
val BORDER_DISTRIBUTED: PortStyle

/**
 * A constant defining that ports are assigned based on given [port constraints][yfiles.layout.PortConstraint].
 * 
 * Value - `3`
 * @see [ClassicTreeLayout.portStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PortStyle%23PORT_CONSTRAINTS_AWARE">Online Documentation</a>
 */
val PORT_CONSTRAINTS_AWARE: PortStyle
   }
}
