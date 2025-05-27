// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import web.svg.SVGElement
import yfiles.lang.ClassMetadata
import yfiles.lang.ICloneable

/**
 * Represents any object that fills an area.
 * 
 * The fill that is defined by instances of this type can be applied to an SVG element using either the static helper [setFill][Fill] or the instance method [applyTo][Fill].
 * This is a convertible type that can be used with the following notation(s) in parameter lists, parameter objects or setters.
 * CSS color strings are converted to [CssFill]s. For example:
 * 
 * ```
 * 'blue'
 * '#369'
 * '#336699'
 * '#369A',
 * '#336699AA'
 * 'rgb(51, 102, 153)'
 * 'rgba(51, 102, 153 / 0.5)'
 * 'hsl(225, 98%, 60%)'
 * 'hsla(225, 98%, 60% / 0.5)',
 * ```
 * Additionally, SVG strings are supported. For example:
 * 
 * ```
 * 'none'
 * 'url(#gradient)'
 * ```
 * Arrays are converted to [Color].
 * @see [setFill]
 * @see [Color]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill">Online Documentation</a>
 */
abstract external class Fill  : ICloneable<Fill> {
  /**
   * Assigns the fill defined by this instance to the given SVG `element`.
   * @param [element] The element whose fill should be set.
   * @param [context] The context.
   * @see [setFill]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-applyTo">Online Documentation</a>
   */
  fun applyTo(
    element: SVGElement,
    context: ICanvasContext,
  )
  
  /**
   * Clones this instance by returning a memberwise clone, or by returning `this` if this instance is [frozen][Fill].
   * @return An instance of the same type as this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-clone">Online Documentation</a>
   */
  override fun clone(): Fill
  
  /**
   * Freezes and returns this instance.
   * @return This instance, made immutable.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-freeze">Online Documentation</a>
   */
  open fun freeze(): Fill
  
  /**
   * Determines whether this [Fill] is equal to the specified object.
   * @param [fill] The other [Fill] instance to compare.
   * @return `true`, if this [Color] is equal to the other object; `false`, otherwise.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-hasSameValue">Online Documentation</a>
   */
  abstract infix fun hasSameValue(
    fill: Fill?,
  ): Boolean
  
  /**
   * Determines if this instance is frozen.
   * @return `true` if this instance is frozen; otherwise, `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-isFrozen">Online Documentation</a>
   */
  fun isFrozen(): Boolean
  
  companion object : ClassMetadata<Fill> {
    /**
     * Creates a [Fill] instance from the given fill-like object by performing automatic type conversion.
     * @param [fillLike] The object to convert to a [Fill].
     * @return The given `fillLike` if it is already a [Fill], or a new instance initialized to the values found in `fillLike`.
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-from">Online Documentation</a>
     */
    @JsName("from")
    operator fun invoke(
      fillLike: String,
    ): Fill
    
    /**
     * Sets the [Fill] on a given SVG element as the fill.
     * @receiver The fill that should be applied. If `null`, the element's fill is set to `none` .
     * @param [element] The SVG element whose fill should be set.
     * @param [context] The context to use for managing possible `defs` entries.
     * @see [applyTo]
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Fill%23Fill-method-setFill">Online Documentation</a>
     */
    @JsName("setFill")
    fun Fill?.applyTo(
      element: SVGElement,
      context: ICanvasContext,
    )
  }
}
