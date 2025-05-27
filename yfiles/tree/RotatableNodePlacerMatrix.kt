// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

import yfiles.lang.ClassMetadata
import yfiles.lang.YObject

/**
 * A matrix describes the rotation of the subtree handled by [RotatableNodePlacerBase].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix">Online Documentation</a>
 */
external open class RotatableNodePlacerMatrix  : YObject {

/**
 * Compares the values of the current [RotatableNodePlacerMatrix] with the values of the given [RotatableNodePlacerMatrix].
 * @param [other] the matrix
 * @return `true` if this matrix and the given other matrix contain the same values, `false` otherwise
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23RotatableNodePlacerMatrix-method-equalValues">Online Documentation</a>
 */
 open infix   fun equalValues( other: RotatableNodePlacerMatrix ):Boolean
/**
 * Multiplies this [RotatableNodePlacerMatrix] with the given other [RotatableNodePlacerMatrix].
 * @param [other] the other matrix
 * @return the product of both matrices
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23RotatableNodePlacerMatrix-method-multiply">Online Documentation</a>
 */
 open   fun multiply( other: RotatableNodePlacerMatrix ):RotatableNodePlacerMatrix

/**
 * Multiplies this [RotatableNodePlacerMatrix] with the given other [RotatableNodePlacerMatrix].
 * @param [other] the other matrix
 * @return the product of both matrices
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23RotatableNodePlacerMatrix-method-multiply">Online Documentation</a>
 */
@JsName("multiply")
  final operator fun times( other: RotatableNodePlacerMatrix ):RotatableNodePlacerMatrix

companion object : ClassMetadata<RotatableNodePlacerMatrix> {
/**
 * The identity matrix which does not apply any rotation or mirroring.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23DEFAULT">Online Documentation</a>
 */
 val DEFAULT: RotatableNodePlacerMatrix
/**
 * A matrix which applies a horizontal mirroring.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23MIR_HOR">Online Documentation</a>
 */
 val MIR_HOR: RotatableNodePlacerMatrix
/**
 * A matrix which applies a horizontal mirroring and a counter-clockwise rotation by 90 degrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23MIR_HOR_ROT90">Online Documentation</a>
 */
 val MIR_HOR_ROT90: RotatableNodePlacerMatrix
/**
 * A matrix which applies a vertical mirroring.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23MIR_VERT">Online Documentation</a>
 */
 val MIR_VERT: RotatableNodePlacerMatrix
/**
 * A matrix which applies a vertical mirroring and a counter-clockwise rotation by 90 degrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23MIR_VERT_ROT90">Online Documentation</a>
 */
 val MIR_VERT_ROT90: RotatableNodePlacerMatrix
/**
 * A matrix which applies a rotation by 180 degrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23ROT180">Online Documentation</a>
 */
 val ROT180: RotatableNodePlacerMatrix
/**
 * A matrix which applies a counter-clockwise rotation by 270 degrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23ROT270">Online Documentation</a>
 */
 val ROT270: RotatableNodePlacerMatrix
/**
 * A matrix which applies a counter-clockwise rotation by 90 degrees.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RotatableNodePlacerMatrix%23ROT90">Online Documentation</a>
 */
 val ROT90: RotatableNodePlacerMatrix
}
}
