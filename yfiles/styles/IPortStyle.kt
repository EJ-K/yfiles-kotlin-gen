// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ICloneable
import yfiles.lang.InterfaceMetadata

/**
 * Style implementation for [IPort][yfiles.graph.IPort] instances in an [IGraph][yfiles.graph.IGraph].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyle">Online Documentation</a>
 */
external interface IPortStyle : ICloneable<IPortStyle> {
/**
 * Gets the renderer implementation that can be queried for implementations that provide details about the visual appearance and visual behavior for a given port and this style instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IPortStyle%23renderer">Online Documentation</a>
 */
val renderer: IPortStyleRenderer

companion object : InterfaceMetadata<IPortStyle> {
}
}
