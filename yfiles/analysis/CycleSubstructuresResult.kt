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
 * Represents the cycles found by [CycleSubstructures].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleSubstructuresResult">Online Documentation</a>
 */
external class CycleSubstructuresResult private constructor()  {
  /**
   * Gets the cycles found by [CycleSubstructures].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/CycleSubstructuresResult%23cycles">Online Documentation</a>
   */
  final val cycles: ResultItemCollection<SubstructureItems>
  
  companion object : ClassMetadata<CycleSubstructuresResult> {
  }
}
