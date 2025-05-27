// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.dom.Element
import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * An utility type for [HtmlVisual] that restricts the type of the [HtmlVisual.element] property and adds a [tag] property to store additional data.
 * @param [TElement] The type of the [element] property.
 * @param [TTag] The type of the [tag] property.
 * @see [TypedHtmlVisual]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TaggedHtmlVisual">Online Documentation</a>
 */
external interface TaggedHtmlVisual<TElement : Element, TTag> : YObject {
/**
 * Gets or sets the HTML element of this visual.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TaggedHtmlVisual%23element">Online Documentation</a>
 */
var element: TElement
/**
 * Gets or sets an object that stores additional data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TaggedHtmlVisual%23tag">Online Documentation</a>
 */
var tag: TTag

companion object : InterfaceMetadata<TaggedHtmlVisual<*, *>> {
}
}
