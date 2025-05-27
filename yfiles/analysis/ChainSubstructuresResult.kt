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
 * Represents the chains found by [ChainSubstructures].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructuresResult">Online Documentation</a>
 */
external class ChainSubstructuresResult private constructor()  {
  /**
   * Gets the chains found by [ChainSubstructures].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChainSubstructuresResult%23chains">Online Documentation</a>
   */
  final val chains: ResultItemCollection<SubstructureItems>
  
  companion object : ClassMetadata<ChainSubstructuresResult> {
  }
}
