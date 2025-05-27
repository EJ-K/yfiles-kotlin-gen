// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.algorithms

import yfiles.collections.IComparer
import yfiles.lang.IComparable
import yfiles.lang.YObject

/**
 * This class provides access to some Comparator instances that are commonly used in yFiles.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers">Online Documentation</a>
 */
external object Comparers {
/**
 * Compares the specified floating point numbers.
 * @param [d1] the first number to compare.
 * @param [d2] the second number to compare.
 * @return a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
 * @see [IComparer.compare]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-compare">Online Documentation</a>
 */
 final   fun compare( d1: Double ,
 d2: Double ):Int
/**
 * Returns a [IComparer] that compares to Objects of type Comparable.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createComparableComparer">Online Documentation</a>
 */
 final   fun createComparableComparer():IComparer<Any>
/**
 * Returns a [IComparer] that compares objects of arbitrary type.
 * @param [dp] a data provider that must return a [IComparable] for each object that is being compared by this comparator.
 * @return a [IComparer] that compares arbitrary objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createComparableDataComparer">Online Documentation</a>
 */
 final   fun <K : YObject, V : IComparable<V>>createComparableDataComparer( dp: IDataProvider<K, V> ):IComparer<K>
/**
 * Returns a [IComparer] that compares objects of arbitrary type.
 * @param [dp] a data provider that must return an int value for each object that is being compared by this comparator.
 * @return a [IComparer] that compares arbitrary objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createIntDataComparer">Online Documentation</a>
 */
 final   fun <K : YObject>createIntDataComparer( dp: IDataProvider<K, Int> ):IComparer<K>
/**
 * Returns a [IComparer] that compares objects of type [Edge].
 * @param [dp] a data provider that must return an int value for the source node of each edge being compared.
 * @return a [IComparer] that compares edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createIntDataSourceComparer">Online Documentation</a>
 */
 final   fun createIntDataSourceComparer( dp: IDataProvider<Node, Int> ):IComparer<Edge>
/**
 * Returns a [IComparer] that compares objects of type [Edge].
 * @param [dp] a data provider that must return an int value for the target node of each edge being compared.
 * @return a [IComparer] that compares edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createIntDataTargetComparer">Online Documentation</a>
 */
 final   fun createIntDataTargetComparer( dp: IDataProvider<Node, Int> ):IComparer<Edge>
/**
 * Returns a [IComparer] that compares objects of arbitrary type.
 * @param [dp] a data provider that must return a double value for each object that is being compared by this comparator.
 * @return a [IComparer] that compares arbitrary objects.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createNumberDataComparer">Online Documentation</a>
 */
 final   fun <K : YObject>createNumberDataComparer( dp: IDataProvider<K, Double> ):IComparer<K>
/**
 * Returns a [IComparer] that compares objects of type [Edge].
 * @param [dp] a data provider that must return a double value for the source node of each edge being compared.
 * @return a [IComparer] that compares edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createNumberDataSourceComparer">Online Documentation</a>
 */
 final   fun createNumberDataSourceComparer( dp: IDataProvider<Node, Double> ):IComparer<Edge>
/**
 * Returns a [IComparer] that compares objects of type [Edge].
 * @param [dp] a data provider that must return a double value for the target node of each edge being compared.
 * @return a [IComparer] that compares edges.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/Comparers%23Comparers-method-createNumberDataTargetComparer">Online Documentation</a>
 */
 final   fun createNumberDataTargetComparer( dp: IDataProvider<Node, Double> ):IComparer<Edge>
}
