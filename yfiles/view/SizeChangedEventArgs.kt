// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.html.HTMLElement
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs

/**
 * This event occurs when the size of a control is changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedEventArgs">Online Documentation</a>
 */
external  class SizeChangedEventArgs  : EventArgs {

/**
 * Gets or sets the old size of the control.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedEventArgs%23oldSize">Online Documentation</a>
 */
final val oldSize: Size
/**
 * Gets or sets the element whose size was changed.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SizeChangedEventArgs%23source">Online Documentation</a>
 */
final val source: HTMLElement

companion object : ClassMetadata<SizeChangedEventArgs> {
}
}
