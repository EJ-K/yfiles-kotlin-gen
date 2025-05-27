// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Enumeration values to control the order in which [IOutputHandler] instances are used.
 * @see [IOutputHandler.precedence]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence">Online Documentation</a>
 */
external sealed class WritePrecedence: YEnum<WritePrecedence> {
   companion object: EnumMetadata<WritePrecedence> {
       /**
 * The handler writes its content before the child nodes of the governing GraphML element.
 * 
 * Value - `-10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence%23BEFORE_CHILDREN">Online Documentation</a>
 */
val BEFORE_CHILDREN: WritePrecedence

/**
 * Default precedence, the order in relation to child content is unspecified.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence%23DEFAULT">Online Documentation</a>
 */
val DEFAULT: WritePrecedence

/**
 * The handler writes its content after the child nodes of the governing GraphML element.
 * 
 * Value - `10`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WritePrecedence%23AFTER_CHILDREN">Online Documentation</a>
 */
val AFTER_CHILDREN: WritePrecedence
   }
}
