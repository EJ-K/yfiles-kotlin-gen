// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.graph.ILookup
import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * Provides a base class for all XAML markup extensions.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupExtension">Online Documentation</a>
 */
external abstract class MarkupExtension  : YObject {

/**
 * Returns an object that is set as the value of the target property for this markup extension.
 * @param [serviceProvider] An object that can provide services for the markup extension.
 * @return The object value to set on the property where the extension is applied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/MarkupExtension%23MarkupExtension-method-provideValue">Online Documentation</a>
 */
 abstract   fun provideValue( serviceProvider: ILookup? ):Any?

companion object : ClassMetadata<MarkupExtension> {
}
}
