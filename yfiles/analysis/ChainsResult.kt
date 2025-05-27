// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.analysis

import yfiles.lang.ClassMetadata

/**
 * Represents the chains found in the graph as computed by [chains][ChainsResult].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainsResult">Online Documentation</a>
 */
external class ChainsResult private constructor()  {
  /**
   * All chains in the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainsResult%23chains">Online Documentation</a>
   */
  final val chains: ResultItemCollection<Path>
  
  companion object : ClassMetadata<ChainsResult> {
  }
}
