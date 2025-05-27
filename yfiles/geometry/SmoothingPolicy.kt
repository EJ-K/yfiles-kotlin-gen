// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

/**
 * Policy determining how corners in paths are smoothed in [createSmoothedPath][GeneralPath].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmoothingPolicy">Online Documentation</a>
 */

sealed external class SmoothingPolicy {
  /**
   * For each corner the smoothing length can be different on both sides, for example when the adjacent segments have different lengths.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmoothingPolicy%23ASYMMETRIC">Online Documentation</a>
   */
  object ASYMMETRIC: SmoothingPolicy
  
  /**
   * Limits the smoothing length to the same value on both sides of a corner to avoid lopsided curves around a mixture of short and long segments.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SmoothingPolicy%23SYMMETRIC">Online Documentation</a>
   */
  object SYMMETRIC: SmoothingPolicy
}
