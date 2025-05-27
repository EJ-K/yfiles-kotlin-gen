// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface implemented by items that can be tagged with arbitrary objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITagOwner">Online Documentation</a>
 */
external interface ITagOwner : YObject {
/**
 * Gets or sets the tag associated with this instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ITagOwner%23tag">Online Documentation</a>
 */
var tag: Tag?

companion object : InterfaceMetadata<ITagOwner> {
}
}
