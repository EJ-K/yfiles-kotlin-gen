// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

import yfiles.graph.IBend
import yfiles.lang.InterfaceMetadata

/**
 * An interface that checks for containment of an [IBend] in 2D coordinate space.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContainsBendTester">Online Documentation</a>
 */
external interface IContainsBendTester  {
  /**
   * Determines whether the provided `bend` is deemed to lie within the shape this test is implemented for.
   * @param [context] The input mode context to use.
   * @param [bend] The bend to test
   * @return `true` iff the bend is contained within the shape.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IContainsBendTester%23IContainsBendTester-method-contains">Online Documentation</a>
   */
  fun contains(
    context: IInputModeContext,
    bend: IBend,
  ): Boolean

  
  companion object : InterfaceMetadata<IContainsBendTester> {
  }
}
