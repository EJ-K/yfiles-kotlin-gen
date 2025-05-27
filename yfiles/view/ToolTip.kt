// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.html.HTMLDivElement
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Displays a string or any HTML element as tooltip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23ToolTip-constructor-ToolTip">Online Documentation</a>
 */
external open class ToolTip  () : YObject {

/**
 * Gets or sets the content of this tooltip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23content">Online Documentation</a>
 */
final var content: ToolTipContent?
/**
 * Gets the desired size of this tooltip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23desiredSize">Online Documentation</a>
 */
final val desiredSize: Size
/**
 * Gets the div element that represents this [ToolTip].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23div">Online Documentation</a>
 */
final val div: HTMLDivElement
/**
 * Gets the left position of the tool tip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23horizontalOffset">Online Documentation</a>
 */
final val horizontalOffset: Double
/**
 * Specifies whether the tool tip is visible.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23isOpen">Online Documentation</a>
 */
final var isOpen: Boolean
/**
 * Gets the top position of the tool tip.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23verticalOffset">Online Documentation</a>
 */
final val verticalOffset: Double
/**
 * Creates the [HTML element][HTMLDivElement] in which the content is displayed.
 * @return A HTML div element.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23ToolTip-method-createToolTip">Online Documentation</a>
 */
 open protected   fun createToolTip():HTMLDivElement
/**
 * Sets the content to the HTML element that is displayed as tool tip.
 * @param [oldContent] The content to remove.
 * @param [newContent] The content to add.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23ToolTip-method-onContentChanged">Online Documentation</a>
 */
 open protected   fun onContentChanged( oldContent: ToolTipContent? ,
 newContent: ToolTipContent? )
/**
 * Updates the current tooltip location in the page.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ToolTip%23ToolTip-method-updateLocation">Online Documentation</a>
 */
 final   fun updateLocation()

companion object : ClassMetadata<ToolTip> {
}
}

inline fun ToolTip(
    block: ToolTip.() -> Unit
): ToolTip {
    return ToolTip()
        .apply(block)
}
