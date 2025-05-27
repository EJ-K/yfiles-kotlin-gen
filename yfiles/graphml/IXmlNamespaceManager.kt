// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graphml

import yfiles.collections.IMap
import yfiles.lang.InterfaceMetadata

/**
 * Facilitates namespace handling together with [IXmlWriter] instances.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlNamespaceManager">Online Documentation</a>
 */
external interface IXmlNamespaceManager  {
  /**
   * Gets a list of all namespace declarations that should be declared at the document's root element.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlNamespaceManager%23globalNamespaces">Online Documentation</a>
   */
  val globalNamespaces: IMap<String, String>
  
  /**
   * Returns a unique namespace prefix, or creates and registers one.
   * @param [ns] The namespace URI for which a prefix is searched.
   * @return a unique namespace prefix for `ns`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlNamespaceManager%23IXmlNamespaceManager-method-getOrCreateUniqueMapping">Online Documentation</a>
   */
  fun getOrCreateUniqueMapping(
    ns: String,
  ): String
  
  /**
   * Pops a current declaration scope.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlNamespaceManager%23IXmlNamespaceManager-method-popScope">Online Documentation</a>
   */
  fun popScope()
  
  /**
   * Pushes a current declaration scope.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlNamespaceManager%23IXmlNamespaceManager-method-pushScope">Online Documentation</a>
   */
  fun pushScope()
  
  /**
   * Register a local namespace/prefix mapping
   * @param [nsUri] The namespace URI
   * @param [prefix] The preferred namespace prefix or `null` if any prefix may be used.
   * @return The prefix that finally has been used for the namespace URI.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlNamespaceManager%23IXmlNamespaceManager-method-registerLocalMapping">Online Documentation</a>
   */
  fun registerLocalMapping(
    nsUri: String,
    prefix: String?,
  ): String
  
  /**
   * Seals the current declaration scope.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IXmlNamespaceManager%23IXmlNamespaceManager-method-sealScope">Online Documentation</a>
   */
  fun sealScope()

  
  companion object : InterfaceMetadata<IXmlNamespaceManager> {
  }
}
