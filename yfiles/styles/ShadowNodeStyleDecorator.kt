// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ClassMetadata

/**
 * Decorates other node styles with a smooth drop shadow.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShadowNodeStyleDecorator">Online Documentation</a>
 * 
 * @constructor Creates a new instance wrapping the provided style.
 * @param [wrappedStyle] The style to wrap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShadowNodeStyleDecorator%23ShadowNodeStyleDecorator-constructor-ShadowNodeStyleDecorator">Online Documentation</a>
 * 
 * @property wrappedStyle
 * Gets or sets the wrapped node style instance by reference.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShadowNodeStyleDecorator%23wrappedStyle">Online Documentation</a>
 */
external class ShadowNodeStyleDecorator (
final var wrappedStyle: INodeStyle = definedExternally) : INodeStyle {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShadowNodeStyleDecorator%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShadowNodeStyleDecorator%23ShadowNodeStyleDecorator-method-clone">Online Documentation</a>
   */
  override fun clone(): ShadowNodeStyleDecorator
  
  companion object : ClassMetadata<ShadowNodeStyleDecorator> {
  }
}

inline fun ShadowNodeStyleDecorator(
    block: ShadowNodeStyleDecorator.() -> Unit
): ShadowNodeStyleDecorator {
    return ShadowNodeStyleDecorator()
        .apply(block)
}
