// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Channel orientation specifier for routing edges vertically.
 * @see [ChannelRoutingTool]
 * @see [ChannelRoutingTool.setChannel]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelOrientation">Online Documentation</a>
 */
external sealed class ChannelOrientation: YEnum<ChannelOrientation> {
   companion object: EnumMetadata<ChannelOrientation> {
       /**
 * Channel orientation specifier for routing edges vertically.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelOrientation%23VERTICAL">Online Documentation</a>
 */
val VERTICAL: ChannelOrientation

/**
 * Channel orientation specifier for routing edges horizontally.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChannelOrientation%23HORIZONTAL">Online Documentation</a>
 */
val HORIZONTAL: ChannelOrientation
   }
}
