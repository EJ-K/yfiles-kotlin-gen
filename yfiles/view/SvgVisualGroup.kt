// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.collections.IList
import yfiles.geometry.Matrix
import yfiles.lang.ClassMetadata

/**
 * A container that can hold a number of [SvgVisual]s.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [SvgVisualGroup] class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup%23SvgVisualGroup-constructor-SvgVisualGroup">Online Documentation</a>
 */
open external class SvgVisualGroup () : SvgVisual {
  /**
   * Gets the list of children with read and write access.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup%23children">Online Documentation</a>
   */
  final val children: IList<SvgVisual?>
  
  /**
   * Gets or sets a transform that is applied to the children of the container.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup%23transform">Online Documentation</a>
   */
  open var transform: Matrix
  
  /**
   * Adds another [SvgVisual] to the children collection of this instance.
   * @param [child] The child to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup%23SvgVisualGroup-method-add">Online Documentation</a>
   */
  fun add(
    child: SvgVisual,
  )
  
  /**
   * Adds another [SvgVisual] to the children collection of this instance.
   * @param [child] The child to add.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup%23SvgVisualGroup-method-add">Online Documentation</a>
   */
  @JsName("add")
  final operator fun plusAssign(
    child: SvgVisual,
  )
  
  /**
   * Removes a previously added [SvgVisual] from the children collection of this instance.
   * @param [child] The child to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup%23SvgVisualGroup-method-remove">Online Documentation</a>
   */
  fun remove(
    child: SvgVisual,
  )
  
  /**
   * Removes a previously added [SvgVisual] from the children collection of this instance.
   * @param [child] The child to remove.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SvgVisualGroup%23SvgVisualGroup-method-remove">Online Documentation</a>
   */
  @JsName("remove")
  final operator fun minusAssign(
    child: SvgVisual,
  )
  
  companion object : ClassMetadata<SvgVisualGroup> {
  }
}

inline fun SvgVisualGroup(
    block: SvgVisualGroup.() -> Unit
): SvgVisualGroup {
    return SvgVisualGroup()
        .apply(block)
}
