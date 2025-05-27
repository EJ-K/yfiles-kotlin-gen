// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

import yfiles.lang.ClassMetadata

/**
 * A tangent in a 2D Cartesian coordinate space with double values.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Tangent">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [Tangent] class using the given values for the [point][Tangent] and [vector][Tangent] properties.
 * @param [point] The point of tangency.
 * @param [vector] The directional vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Tangent%23Tangent-constructor-Tangent">Online Documentation</a>
 * 
 * @property point
 * Gets the point of tangency.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Tangent%23point">Online Documentation</a>
 * 
 * @property vector
 * Gets the directional vector.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Tangent%23vector">Online Documentation</a>
 */
external class Tangent (
final val point: Point,
final val vector: Point)  {
  /**
   * @return [point]
   */    
  @JsName("__ygen_point_negy__")
  final operator fun component1(): Point
  /**
   * @return [vector]
   */    
  @JsName("__ygen_vector_negy__")
  final operator fun component2(): Point
  
  
  
  companion object : ClassMetadata<Tangent> {
  }
}
