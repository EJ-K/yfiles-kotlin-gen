// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.lang.InterfaceMetadata
import yfiles.lang.YObject

/**
 * Interface for mapping XAML namespaces to XML namespace prefixes and vice versa.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXamlPrefixMapper">Online Documentation</a>
 */
external interface IXamlPrefixMapper : YObject {
/**
 * Gets the namespace for the given prefix.
 * @param [prefix] The prefix.
 * @return The namespace.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXamlPrefixMapper%23IXamlPrefixMapper-method-getNamespaceOfPrefix">Online Documentation</a>
 */
   fun getNamespaceOfPrefix( prefix: String? ):String?
/**
 * Gets the prefix of namespace.
 * @param [ns] The namespace.
 * @return The prefix to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXamlPrefixMapper%23IXamlPrefixMapper-method-getPrefixOfNamespace">Online Documentation</a>
 */
   fun getPrefixOfNamespace( ns: String ):String?

companion object : InterfaceMetadata<IXamlPrefixMapper> {
}
}
